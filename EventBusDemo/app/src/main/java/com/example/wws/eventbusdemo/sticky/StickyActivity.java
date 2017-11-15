package com.example.wws.eventbusdemo.sticky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wws.eventbusdemo.R;
import com.example.wws.eventbusdemo.event.Event01;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class StickyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void hand(Event01 event01) {
        String name = event01.getName();
    }
}
