package com.yw.threaddemo;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by yw on 17/10/25.
 * author jackyang
 * com.yw.threaddemo
 */
public class IntentServiceDemo extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public IntentServiceDemo(String name) {
        super(name);
    }

    public IntentServiceDemo() {
        super("yw");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        String hint = intent.getStringExtra("hint");
        Log.d("yw", hint);
    }

    @Override
    public void onDestroy() {
        Log.d("yw", "onDestroy");
        super.onDestroy();
    }
}
