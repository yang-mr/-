package com.example.contentproviderdemo;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.contentproviderdemo.db.MyDbHelper;

/**
 * Created on 2017/10/2917:24.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class FootProvider extends ContentProvider {
    private SQLiteDatabase mDb;
    private Context mContext;

    private final static String authority = "com.example.contentproviderdemo.testprovider";
    private UriMatcher mUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    @Override
    public boolean onCreate() {
        //进行一些初始化工作
        //运行在主线程，不要做耗时操作
        Log.d("yw", "provider create...");

        mUriMatcher.addURI(authority, "book", 1);
        mUriMatcher.addURI(authority, "foot", 2);

        MyDbHelper helper = new MyDbHelper(mContext = getContext(), null, null, 1);
        mDb = helper.getWritableDatabase();

//        new Thread(){
//            @Override
//            public void run() {
//                Log.d("yw", "provider create...");
//
//                mDb.execSQL("insert into book(author, name) values('jack', 'android')");
//                mDb.execSQL("insert into book(author, name) values('jack', 'android')");
//                mDb.execSQL("insert into book(author, name) values('jack', 'android')");
//
//                mDb.execSQL("insert into foot(name, price) values('jack', 10)");
//                mDb.execSQL("insert into foot(name, price) values('jack', 9)");
//                mDb.execSQL("insert into foot(name, price) values('jack', 8)");
//            }
//        }.start();
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
       String tableName = getTableName(uri);
//        public Cursor query(String table, String[] columns, String selection,
//                String[] selectionArgs, String groupBy, String having,
//                String orderBy)
        return mDb.query(tableName, projection, selection, selectionArgs, null, null, sortOrder);

        //运行在Binder线程池
    }

    private String getTableName(Uri uri) {
        Log.d("yw", uri.toString());
        int code = mUriMatcher.match(uri);
        if (code == 1) {
            //book表
            return "book";
        } else if (code == 2) {
            //foot表
            return "foot";
        }
        return "";
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {

        //获得Uri请求所对应的MIME类型
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        //运行在Binder线程池
        String tableName = getTableName(uri);
        mDb.insert(tableName, null, values);
        //通知客户端
        mContext.getContentResolver().notifyChange(uri, null);

        return uri;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        String tableName = getTableName(uri);
        int count = mDb.delete(tableName, selection, selectionArgs);
        if (count > 0) {
            mContext.getContentResolver().notifyChange(uri, null);
        }
        return count;

        //运行在Binder线程池

    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        String tableName = getTableName(uri);
//    public int update(String table, ContentValues values, String whereClause, String[] whereArgs) {

        int count = mDb.update(tableName, values, selection, selectionArgs);
        if (count > 0) {
            mContext.getContentResolver().notifyChange(uri, null);
        }
        return count;
        //运行在Binder线程池

    }
}
