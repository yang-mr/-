package com.example.socketdemo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    private TextView mMsgList;
    private EditText mEt;
    private boolean mIsConn = false;
    private Socket mSocket = null;
    private PrintWriter mPrintWriter;
    private ProgressDialog mDialog;
    private Thread mThread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMsgList = (TextView) findViewById(R.id.tv_msg_list);
        mEt = (EditText) findViewById(R.id.et);

        Intent intent = new Intent(this, TPCSocket.class);
        startService(intent);
    }

    private class MyThread extends Thread {
        @Override
        public void run() {
            while (mSocket == null) {
                try {
                    mSocket = new Socket("127.0.0.1", 8888);
                    mIsConn = true;

                    //发送的对象
                    mPrintWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(mSocket.getOutputStream())), true);
                } catch (IOException e) {
                    mIsConn = false;
                    e.printStackTrace();
                    SystemClock.sleep(1000); //重试时间间隔1秒
                }
            }
            //发送连接成功消息
            mHandler.sendEmptyMessage(1);

            //接受消息
            while (mIsConn && !mSocket.isClosed()) {
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
                    String msg = reader.readLine();
                    Log.d("yw", msg);
                    Message message = new Message();
                    Bundle bundle = new Bundle();
                    bundle.putString("msg", msg);
                    message.setData(bundle);
                    message.what = 2;
                    mHandler.sendMessage(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void connService(View view) {
        if (mIsConn) {
            Toast.makeText(this, "不要重复连接哦", Toast.LENGTH_SHORT).show();
            return;
        }
        //连接服务
        mDialog =
                new ProgressDialog(this);
        mDialog.setCancelable(false);
        mDialog.show();

        mThread = new MyThread();
        mThread.start();
    }

    public void disService(View view) {
        if (!mIsConn) {
            Toast.makeText(this, "不要重复断开哦", Toast.LENGTH_SHORT).show();
            return;
        }
        //断开服务
        try {
            mThread.interrupt();
            mSocket.close();
            mSocket = null;
            mIsConn = false;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(View view) {
        if (!mIsConn) {
            Toast.makeText(this, "连接服务后才能发送哦", Toast.LENGTH_SHORT).show();
            return;
        }
        //发送消息
        new Thread() {
            @Override
            public void run() {
                mPrintWriter.println(mEt.getText().toString());
            }
        }.start();
    }

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    //连接成功
                    mDialog.dismiss();
                    Toast.makeText(MainActivity.this, "连接成功", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    //显示消息
                    String message = msg.getData().getString("msg");
                    mMsgList.setText(mMsgList.getText() + "\n" + message);
                    break;
            }
            super.handleMessage(msg);
        }
    };
}
