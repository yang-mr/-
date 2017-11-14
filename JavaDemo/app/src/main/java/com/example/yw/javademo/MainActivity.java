package com.example.yw.javademo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;

import com.example.yw.javademo.泛型.Main;
import com.example.yw.javademo.泛型.StringCompare;
import com.example.yw.javademo.泛型.demo2.Banana;

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
}
