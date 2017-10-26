package com.yw.messengerdemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.yw.messengerdemo.service.MService;

public class MainActivity extends AppCompatActivity {
    private EditText mEt;
    private Messenger mMessenger;
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEt = (EditText) findViewById(R.id.et);
        mTv = (TextView) findViewById(R.id.tv);

        Intent intent = new Intent(this, MService.class);
        bindService(intent, mServiceConn, Context.BIND_AUTO_CREATE);
    }

    public void send_msg(View view) {
        Message message = Message.obtain();
        message.what = 0;
        message.replyTo = new Messenger(mHandler);  //给服务器传一个Messager 为了让服务器用这个Messenger回消息
        Bundle b = new Bundle();
        String msg = mEt.getText().toString();
        b.putString("test", msg);
        message.setData(b);
        try {
            mMessenger.send(message);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    //接受服务器的消息
    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    mTv.setText(msg.getData().getString("msgByService"));
                    break;
            }
            return false;
        }
    });

    //创建一个服务连接
    private ServiceConnection mServiceConn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mMessenger = new Messenger(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(mServiceConn);
    }
}
