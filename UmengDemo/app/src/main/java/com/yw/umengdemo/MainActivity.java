package com.yw.umengdemo;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv_name);

        tv.setText(getAppInfo("UMENG_CHANNEL"));
    }

    private String getAppInfo(String name) {
        String value = "";
        try {
            ApplicationInfo info = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            //ApplicationInfo info = getApplicationInfo();

            value = info.metaData.getString(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}
