package com.example.yw.viewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button mBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // mBt = (Button) findViewById(R.id.bt_test);

//        mBt.setShadowLayer(5F, 10F, 10F, R.color.colorAccent);

        //testWindow();

       // testHandler();
    }

    private void testHandler() {
        Looper.prepareMainLooper();

        Handler handler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                switch (msg.what) {
                    case 0:
                        break;
                }
                return false;
            }
        });
        Looper.loop();
        handler.sendEmptyMessage(0);
    }

    private void testHandlerOnThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                Handler handler = new Handler(new Handler.Callback() {
                    @Override
                    public boolean handleMessage(Message msg) {
                        switch (msg.what) {
                            case 0:
                                break;
                        }
                        return false;
                    }
                });
                Looper.loop();
                handler.sendEmptyMessage(0);
            }
        });
    }

    private void testWindow() {
        //getWindowManager().
        Button bt = new Button(this);
        bt.setText("test window");
        getWindowManager().addView(bt, null);
    }

    /**
     * 1.layer-list标签实现的阴影只能做为background引入使用在Button上
     * 2.TextView, ImageView 使用如下的方法实现阴影效果
     * Paint.setShadowLayer实现阴影效果
     */





}
