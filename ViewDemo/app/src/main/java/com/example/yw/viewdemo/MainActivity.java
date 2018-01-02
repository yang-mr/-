package com.example.yw.viewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // mBt = (Button) findViewById(R.id.bt_test);

//        mBt.setShadowLayer(5F, 10F, 10F, R.color.colorAccent);
    }

    /**
     * 1.layer-list标签实现的阴影只能做为background引入使用在Button上
     * 2.TextView, ImageView 使用如下的方法实现阴影效果
     * Paint.setShadowLayer实现阴影效果
     */

}
