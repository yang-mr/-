package com.yw.imgdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.iv);

        final String url = "http://img.taopic.com/uploads/allimg/120727/201995-120HG1030762.jpg";

        Glide.with(this)
                .load(url)
                .skipMemoryCache(true)  //禁用内存缓存
                .diskCacheStrategy(DiskCacheStrategy.ALL) //禁用硬盘缓存
                // .downloadOnly();
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        return true;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        // iv.setImageDrawable(resource);
                        return false;
                    }
                })
                .into(iv);

    }
}
