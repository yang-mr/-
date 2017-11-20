package com.example.wws.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OtherActivity extends AppCompatActivity implements View.OnClickListener {
    private final static String BROADCASTRECEIVER_ACTION = "test";
    private BroadcastReceiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        //动态注册广播
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BROADCASTRECEIVER_ACTION);
        intentFilter.setPriority(1000);

        this.registerReceiver(mReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                intent.getIntExtra("hint", 0);
                intent.putExtra("hint", 444);
                intent.putExtra("sb", "sb");
            }
        }, intentFilter);

        findViewById(R.id.bt_send).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_send) {
            Intent intent = new Intent();
            intent.setAction(BROADCASTRECEIVER_ACTION);
            intent.putExtra("hint", 123);
            this.sendBroadcast(intent);
        }
    }
}
