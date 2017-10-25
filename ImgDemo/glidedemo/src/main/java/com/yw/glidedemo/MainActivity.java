package com.yw.glidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.bt_display_img)
    Button btDisplayImg;
    @Bind(R.id.iv)
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    SimpleTarget<GlideDrawable> target = new SimpleTarget<GlideDrawable>() {
        @Override
        public void onResourceReady(GlideDrawable resource, GlideAnimation glideAnimation) {
            iv.setImageDrawable(resource);
        }
    };
    @OnClick(R.id.bt_display_img)
    public void onViewClicked() {
        final String url = "http://img.blog.csdn.net/2016050711203928";


        Glide.with(this)
                .load(url)
                .placeholder(R.drawable.test_image)
                .skipMemoryCache(true)  //禁用内存缓存
                .diskCacheStrategy(DiskCacheStrategy.NONE) //禁用硬盘缓存
                .error(R.drawable.error)   //出现异常的时候显示的占位图                 // .preload();  //预加载图片 加载而不显示图片
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
