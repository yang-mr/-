package com.example.coordinatorlayoutdemo;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class AppBarLayout_CollapsingToolbarLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout__collapsing_toolbar_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("我是Toolbar里面设置的标题");

        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.back); //设置导航icon
        toolbar.setOverflowIcon(getDrawable(R.drawable.back));

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
    }
}
