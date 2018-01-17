package com.example.yw.javademo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;

import com.example.yw.javademo.泛型.Main;
import com.example.yw.javademo.泛型.StringCompare;
import com.example.yw.javademo.泛型.demo2.Banana;

import java.nio.ByteBuffer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //test extends 泛型 类型绑定
        StringCompare stringCompare = Main.min(new StringCompare("111"), new StringCompare("1"));

        Main.getName(new Banana("我是香蕉"));

        startActivity(new Intent(this, MainActivity.class));
    }

    public static void main(String[] args) {
        testThreadLocal();

        testByteBuffer();
    }

    private static void testByteBuffer() {
        ByteBuffer byteBuffer = ByteBuffer.allocate();
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
}
