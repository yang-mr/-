package com.yw.messengerdemo.service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/**
 * Created by yw on 17/10/26.
 * author jackyang
 * com.yw.messengerdemo.service
 */
public class MService extends Service {
    private final static class MHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    String temp = msg.getData().getString("test");
                    Log.d("yw", temp);

                    //给客户端回复消息
                    Messenger m = msg.replyTo;
                    //创建一个消息Message
                    Message message = Message.obtain(null, 1);
                    Bundle  bundle = new Bundle();
                    bundle.putString("msgByService", "客户端小弟，你少给老子发消息啦,我知道你发的消息是：" + temp);
                    message.setData(bundle);

                    try {
                        //发送消息
                        m.send(message);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    break;
            }
            super.handleMessage(msg);
        }
    }

    //实例一个 Messenger
    private final static Messenger mMessenger = new Messenger(new MHandler());

    @Override
    public IBinder onBind(Intent intent) {
        //提供给客户端Binder
        return mMessenger.getBinder();
    }
}
