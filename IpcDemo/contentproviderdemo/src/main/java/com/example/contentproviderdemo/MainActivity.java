package com.example.contentproviderdemo;

import android.Manifest;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //监听数据
    private ContentObserver mContentObserver;
    private ContentResolver mResolver;
    private final static Uri mBookUri = Uri.parse("content://com.example.contentproviderdemo.testprovider/book");
    private final static Uri mFootUri = Uri.parse("content://com.example.contentproviderdemo.testprovider/foot");  //com.example.contentproviderdemo.testprovider配置文件里的唯一标示
    private TextView mBookList;
    private TextView mFootList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResolver = getContentResolver();
        mContentObserver = new DBObserver(new MyHandler());

        mResolver.registerContentObserver(mBookUri, false, mContentObserver);
        mResolver.registerContentObserver(mFootUri, false, mContentObserver);
        //

        findViewById(R.id.bt_insert_book).setOnClickListener(this);
        findViewById(R.id.bt_insert_foot).setOnClickListener(this);

        mBookList = (TextView) findViewById(R.id.list_book);
        mFootList = (TextView) findViewById(R.id.list_foot);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mResolver.unregisterContentObserver(mContentObserver);
    }

    private class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            Cursor cursor = null;
            StringBuilder stringBuilder = new StringBuilder();
            switch (msg.what) {
                case 1:
                    cursor = mResolver.query(mBookUri, new String[]{"name", "author"}, null, null, null);
                    while (cursor.moveToNext()) {
                        stringBuilder.append("名称：" + cursor.getString(0) + "; 作者" + cursor.getString(1) + "\n");
                    }
                    mBookList.setText(stringBuilder.toString());
                    break;
                case 2:
                    cursor = mResolver.query(mFootUri, new String[]{"name"}, null, null, null);
                    while (cursor.moveToNext()) {
                        stringBuilder.append("名称：" + cursor.getString(0) + "; 描述\n");
                    }
                    mFootList.setText(stringBuilder.toString());
                    break;
            }
        }
    }

    @Override
    public void onClick(View v) {
        ContentValues values = new ContentValues();
        switch (v.getId()) {
            case R.id.bt_insert_book:
                values.put("name", "java教程");
                values.put("author", "rose");
                mResolver.insert(mBookUri, values);
                break;
            case R.id.bt_insert_foot:
                values.put("name", "苹果");
                values.put("desc", "一个很好吃的水果");
                mResolver.insert(mFootUri, values);
                break;
        }
    }

    private boolean checkPermission() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED)
        {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CALL_PHONE},
                    1);
            return false;
        } else
        {
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == 1) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                //callPhone();
            } else
            {
                // Permission Denied
                Toast.makeText(MainActivity.this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
            return;
        }
    }
}
