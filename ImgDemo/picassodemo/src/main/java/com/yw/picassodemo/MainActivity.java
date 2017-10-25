package com.yw.picassodemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);

    }

    public void display_img(View view) {
        iv.setImageDrawable(null);
        final String url = "https://www.baidu.com/img/bd_logo1.png";
        Picasso.with(this).load(/*R.drawable.test_image*/url)
                .placeholder(R.drawable.test_image)
                .into(iv, new Callback() {
                    @Override
                    public void onSuccess() {
                        Picasso
                                .with(MainActivity.this)
                                .load("https://github.com/square/picasso/raw/master/website/static/sample.png")
                                .resize(100, 200) //自定义图片的加载大小
                                .priority(Picasso.Priority.HIGH)  //设置优先级  ps:要显示1张大图 1张小图 业务需要是要先显示大图
                                .noFade()   //去除淡入效果
                                .noPlaceholder()  //去除默认显示的图片
                                .into(iv);
                    }

                    @Override
                    public void onError() {
                        Log.d("yw", "jfkd");
                    }
                });
    }

    public void tag(View view) {
        go(TagActivity.class);
    }

    private void go(Class tClass) {
        Intent intent = new Intent(this, tClass);
        startActivity(intent);
    }
}
