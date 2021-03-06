package com.example.yw.viewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;

import com.example.yw.viewdemo.glide.GlideActivity;

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_getleft).setOnClickListener(this);
        findViewById(R.id.bt_window).setOnClickListener(this);
        findViewById(R.id.bt_ipc).setOnClickListener(this);
        findViewById(R.id.bt_sharedPreferences).setOnClickListener(this);
        findViewById(R.id.bt_glide).setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_getleft:
                // view.getLeft() view.getTop() event.getX() event.getRawX() 等
                startActivity(new Intent(this, GetLeftActivity.class));
                break;
            case R.id.bt_window:
                startActivity(new Intent(this, WindowActivity.class));
                break;
            case R.id.bt_ipc:
                startActivity(new Intent(this, IpcActivity.class));
                break;
            case R.id.bt_sharedPreferences:
                startActivity(new Intent(this, SharedPreferencesActivity.class));
                break;
            case R.id.bt_glide:
                // view.getLeft() view.getTop() event.getX() event.getRawX() 等
                startActivity(new Intent(this, GlideActivity.class));
                break;
        }
    }

    /**
     * 1.layer-list标签实现的阴影只能做为background引入使用在Button上
     * 2.TextView, ImageView 使用如下的方法实现阴影效果
     * Paint.setShadowLayer实现阴影效果
     */
}
