package com.example.contentproviderdemo;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;

/**
 * Created on 2017/10/2921:19.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class DBObserver extends ContentObserver {
    private Handler mHandler;
    private final static Uri mBookUri = Uri.parse("content://com.example.contentproviderdemo.testprovider/book");
    private final static Uri mFootUri = Uri.parse("content://com.example.contentproviderdemo.testprovider/foot");
    /**
     * Creates a content observer.
     *
     * @param handler The handler to run {@link #onChange} on, or null if none.
     */
    public DBObserver(Handler handler) {
        super(handler);
        this.mHandler = handler;
    }

    @Override
    public void onChange(boolean selfChange, Uri uri) {
        super.onChange(selfChange, uri);
        Log.d("yw", "有改变啦" + uri.equals(mFootUri));
        if (uri.equals(mBookUri)) {
            mHandler.sendEmptyMessage(1);  //book有改变啦 更新UI吧
        } else if (uri.equals(mFootUri)) {
            mHandler.sendEmptyMessage(2);  //foot有改变啦 更新UI吧
        }
    }
}
