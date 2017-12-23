package com.example.drawdemo;

import android.content.Intent;
import android.graphics.Region;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTvTitle, mTvFlag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvFlag = (TextView)findViewById(R.id.tv_flag);
        mTvTitle = (TextView)findViewById(R.id.tv_title);
        mTvTitle.setOnClickListener(this);
        mTvFlag.setOnClickListener(this);
        findViewById(R.id.bt_region).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_region:
                startActivity(new Intent(this, RegionActivity.class));
                break;
            case R.id.tv_flag:
                mTvFlag.setText(mTvFlag.getText().toString() + "a");
                break;
            case R.id.tv_title:
                mTvTitle.setText(mTvTitle.getText().toString() + "b");
                break;
        }
    }
}
