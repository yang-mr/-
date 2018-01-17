package com.example.yw.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_intent).setOnClickListener(this);
        findViewById(R.id.bt_ByteBuffer).setOnClickListener(this);
    }

    public static void main(String[] args) {
        testThreadLocal();
    }

    private static void testThreadLocal() {
        final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        new Thread() {
            @Override
            public void run() {
                super.run();
                threadLocal.set(100);
                System.out.println("Thread name: " + Thread.currentThread() + " threadLocal value: " + threadLocal.get());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                super.run();
                threadLocal.set(200);
                System.out.println("Thread name: " + Thread.currentThread() + " threadLocal value: " + threadLocal.get());
            }
        }.start();

        System.out.println("Thread name: " + Thread.currentThread() + " threadLocal value: " + threadLocal.get());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_intent:
                String action = "com.jack.test";
                Intent intent = new Intent(action);
                intent.setAction("com.jack.test1");
                intent.addCategory("ee"); // 设置category 有几个要设置几个

                String type = "image/png";
                String uri = "content://www.baidu.com/test/intent";
                intent.setDataAndType(Uri.parse(uri), type);

               /* intent.setData(Uri.parse(uri)); // 注意会将type = null;
                intent.setType("image/png"); // 注意会将data = null;*/
                startActivity(intent);
                break;

            case R.id.bt_ByteBuffer:
                startActivity(new Intent(this, TestIntentActivity.class));
                break;
        }
    }
}
