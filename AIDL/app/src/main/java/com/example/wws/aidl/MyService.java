package com.example.wws.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created on 2017/11/13  14:57.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    private IBinder iBinder = new IMyAidlInterface.Stub()
    {
        @Override
        public String getInfor(String s) throws RemoteException {
            Log.d("yw", s);
            return "我是 Service 返回的字符串";
        }
    };
}
