package com.yw.threaddemo;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.geocode.GeoCodeOption;
import com.baidu.mapapi.search.geocode.GeoCodeResult;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);

        TextView tv_show_result = (TextView) findViewById(R.id.tv_result);
//        new AsyncTaskDemo(this, tv_show_result).execute("yw"); //创建和执行task
//
//        Intent i = new Intent(this, IntentServiceDemo.class);
//        i.putExtra("hint", "666");
//        startService(i);
//        i.putExtra("hint", "777");
//        startService(i);

       /* final ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        threadLocal.set("main");

        Log.d("yw", threadLocal.get());

        new Thread("test1") {
            @Override
            public void run() {
                super.run();
                threadLocal.set("test1");

                Log.d("yw", threadLocal.get());
            }
        }.start();

        new Thread("test2") {
            @Override
            public void run() {
                super.run();
                Log.d("yw", threadLocal.get() + "");

                Looper.prepare();
                Handler handler = new Handler() {
                    @Override
                    public void handleMessage(Message msg) {
                        super.handleMessage(msg);
                        Log.d("yw", msg.what + "");
                      //  Log.d("yw", threadLocal.get() + "");

                    }
                };
                handler.sendEmptyMessage(1);

                Looper.loop();
                Looper.myLooper().quitSafely();
                Looper.prepare();
                Looper.loop();

            }
        }.start();

        Bundle b = new Bundle();*/

       testAsyn();
    }

    private void testAsyn() {
       AsyncTask.execute(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 100; i++) {
                   Log.d("yw", i + "");
                  // try {
                           Task t = new Task(i);
                   GeoCoder g = GeoCoder.newInstance();
                   ReverseGeoCodeOption o = new ReverseGeoCodeOption();
                   LatLng l = new LatLng(34.7568711, 113.663221);
                   o.location(l);
                   g.reverseGeoCode(o);
                   g.setOnGetGeoCodeResultListener(new OnGetGeoCoderResultListener() {
                       @Override
                       public void onGetGeoCodeResult(GeoCodeResult geoCodeResult) {

                       }

                       @Override
                       public void onGetReverseGeoCodeResult(ReverseGeoCodeResult reverseGeoCodeResult) {
                                Log.d("yw", reverseGeoCodeResult.getAddress());
                       }
                   });
//                           t.setmIDoTask(new Task.IDoTask() {
//                               @Override
//                               public void doWork(int count) {
//                                   Log.d("-----------yw", count + "");
//                               }
//                           });
                          t.start();

                       /*
                           synchronized (this) {
                               this.wait();
                           }

                            synchronized (this) {
                                this.notify();
                            }

                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }*/
               }
           }
       });
    }

//    class MyThread extends Thread {
//        @Override
//        public void run() {
//            super.run();
//        }
//    }
}
