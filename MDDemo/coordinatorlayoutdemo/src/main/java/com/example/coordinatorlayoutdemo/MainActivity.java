package com.example.coordinatorlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_toolbar).setOnClickListener(this);
        findViewById(R.id.bt_CollapsingToolbarLayout).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_toolbar:
                startActivity(new Intent(this, AppBarLayout_Toolbar.class));
                break;
            case R.id.bt_CollapsingToolbarLayout:
                startActivity(new Intent(this, AppBarLayout_CollapsingToolbarLayout.class));
                break;
        }
    }
}
