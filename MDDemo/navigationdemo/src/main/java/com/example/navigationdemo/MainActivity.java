package com.example.navigationdemo;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerlayout;
    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerlayout = (DrawerLayout)findViewById(R.id.drawerlayout);
        mNavigationView = (NavigationView) findViewById(R.id.navigationview);
        mNavigationView.setItemIconTintList(null); //icon显示自身的颜色

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar bar = getSupportActionBar();
        bar.setHomeAsUpIndicator(R.mipmap.ic_launcher); //设置图标
        bar.setDisplayHomeAsUpEnabled(true);

        init();
    }

    private void init() {
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            MenuItem preItem = null;

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (preItem != null) {
                    preItem.setChecked(false);
                }
                item.setChecked(true);
                Log.d("yw", "你点击了标题为" + item.getTitleCondensed() + "的菜单");
                Toast.makeText(MainActivity.this, "你点击了标题为" + item.getTitleCondensed() + "的菜单", Toast.LENGTH_LONG).show();
                mDrawerlayout.closeDrawers();
                preItem = item;   //保存一下上一次点击的item
                return false;
            }
        });

        //获取navigationView的头部布局和里面的控件
        View headerView = mNavigationView.getHeaderView(0);
        ImageView avatar = (ImageView) headerView.findViewById(R.id.avatar);
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("yw", "你点击了头像");
                mDrawerlayout.closeDrawers();
                Toast.makeText(MainActivity.this, "你点击了头像", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("yw", item + "");
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerlayout.openDrawer(GravityCompat.START);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
