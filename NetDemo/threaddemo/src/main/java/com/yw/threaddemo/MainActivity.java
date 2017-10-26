package com.yw.threaddemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_show_result = (TextView) findViewById(R.id.tv_result);
//        new AsyncTaskDemo(this, tv_show_result).execute("yw"); //创建和执行task
//
//        Intent i = new Intent(this, IntentServiceDemo.class);
//        i.putExtra("hint", "666");
//        startService(i);
//        i.putExtra("hint", "777");
//        startService(i);

        final ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        threadLocal.set("main");

        Log.d("yw", threadLocal.get());

        new Thread("test1") {
            @Override
            public void run() {
                super.run();
                threadLocal.set("test1");

                Log.d("yw", threadLocal.get());
            }
        }.start();

        new Thread("test2") {
            @Override
            public void run() {
                super.run();
                Log.d("yw", threadLocal.get() + "");

                Looper.prepare();
                Handler handler = new Handler() {
                    @Override
                    public void handleMessage(Message msg) {
                        super.handleMessage(msg);
                        Log.d("yw", msg.what + "");
                      //  Log.d("yw", threadLocal.get() + "");

                    }
                };
                handler.sendEmptyMessage(1);

                Looper.loop();
                Looper.myLooper().quitSafely();
                Looper.prepare();
                Looper.loop();

            }
        }.start();

        Bundle b = new Bundle();
    }

//    class MyThread extends Thread {
//        @Override
//        public void run() {
//            super.run();
//        }
//    }
}
