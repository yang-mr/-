package com.example.wws.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final static String BROADCASTRECEIVER_ACTION = "test";
    private BroadcastReceiver mReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_narmal_broadcast).setOnClickListener(this);
        findViewById(R.id.bt_ordered_broadcast).setOnClickListener(this);
        findViewById(R.id.bt_sticky_broadcast).setOnClickListener(this);
        findViewById(R.id.bt_system_broadcast).setOnClickListener(this);

        //动态注册广播
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BROADCASTRECEIVER_ACTION);
        intentFilter.setPriority(100);

        this.registerReceiver(mReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String sb = intent.getStringExtra("sb");
            }
        }, intentFilter);
        //静态注册
        /**
         <receiver android:name=".MyBroadcastReceiver">
         <intent-filter>
         <action android:name="test"></action>
         </intent-filter>
         </receiver>
         */
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_narmal_broadcast:
           //     this.sendBroadcast(new Intent(BROADCASTRECEIVER_ACTION));
                break;
            case R.id.bt_system_broadcast:
                /**
                 * 注册一个系统广播  不需要手动发送广播   比如用户关闭飞行模式 会自动触发注册的
                 *   <receiver android:name=".MyBroadcastReceiver">
                     <intent-filter>
                     <action android:name="android.intent.action.AIRPLANE_MODE"></action>
                     </intent-filter>
                     </receiver>
                 */
                Toast.makeText(this, "看注释", 1).show();
                break;
            case R.id.bt_ordered_broadcast:
                startActivity(new Intent(this, OtherActivity.class));
                break;
            case R.id.bt_sticky_broadcast:
                Toast.makeText(this, "5.0已放弃了", 1).show();
                break;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        //this.unregisterReceiver(mReceiver);   //动态注销广播
    }
}
