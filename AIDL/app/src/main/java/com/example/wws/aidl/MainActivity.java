package com.example.wws.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.nfc.Tag;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private IMyAidlInterface myInterface;
    private final static String TAG = "yw";
    private BookManager bookManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent service = new Intent(MainActivity.this, BookService.class);
     //   startService(service);
        bindService(service, bookService, Context.BIND_AUTO_CREATE);

        findViewById(R.id.bt_addbook).setOnClickListener(this);
        findViewById(R.id.bt_books).setOnClickListener(this);
    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myInterface = IMyAidlInterface.Stub.asInterface(service);
            Log.i(TAG, "连接Service 成功");
            try {
                String s = myInterface.getInfor("我是Activity传来的字符串");
                Log.i(TAG, "从Service得到的字符串：" + s);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            name.toString();
        }
    };

    private ServiceConnection bookService = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            bookManager = BookManager.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            name.toString();
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_addbook:
                Book book = new Book("jack", 10);
                try {
                    bookManager.addBook(book);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.bt_books:
                try {
                    List<Book> lists = bookManager.getBooks();
                    lists.size();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
