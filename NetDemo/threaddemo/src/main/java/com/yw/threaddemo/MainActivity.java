package com.yw.threaddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_show_result = (TextView) findViewById(R.id.tv_result);
        new AsyncTaskDemo(this, tv_show_result).execute("yw"); //创建和执行task

        Intent i = new Intent(this, IntentServiceDemo.class);
        i.putExtra("hint", "666");
        startService(i);
        i.putExtra("hint", "777");
        startService(i);
    }

//    class MyThread extends Thread {
//        @Override
//        public void run() {
//            super.run();
//        }
//    }
}
