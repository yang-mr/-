package com.example.wws.eventbusdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.wws.eventbusdemo.event.Event01;
import com.example.wws.eventbusdemo.sticky.StickyActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);

        findViewById(R.id.bt_other).setOnClickListener(this);
        findViewById(R.id.bt_send).setOnClickListener(this);
    }

    private void toActivity() {
        startActivity(new Intent(this, OtherActivity.class));
    }


    //采用默认的模式 POSTING
    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onHandler(Event01 event01) {
        Thread thread = Thread.currentThread();
        Log.d("yw", "onHandler:" + thread);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_send:
                startActivity(new Intent(this, StickyActivity.class));
                EventBus.getDefault().postSticky(new Event01("jack"));
                break;
            case R.id.bt_other:
                toActivity();
                break;
        }
    }
}
