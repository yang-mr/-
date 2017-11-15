package com.example.wws.eventbusdemo;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.wws.eventbusdemo.R;
import com.example.wws.eventbusdemo.event.Event01;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class OtherActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticky);

        findViewById(R.id.bt_send).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_send:
               final Event01 event01 = new Event01("jack");
                event01.setAge(10);
//                EventBus.getDefault().post(event01);

                //主线程发布
                EventBus.getDefault().post(event01);
                //非ui线程发布
              /*  new Thread() {
                    @Override
                    public void run() {
                        super.run();
                        try {
                            // thread.wait(20000);
                       //     Thread.sleep(5000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        EventBus.getDefault().post(event01);
                        Thread thread = Thread.currentThread();
                        Log.d("yw" + this.getName(), thread.toString());
                    }
                }.start();*/
                Thread thread = Thread.currentThread();
                Log.d("yw", thread.toString());
                break;
        }
    }
}
