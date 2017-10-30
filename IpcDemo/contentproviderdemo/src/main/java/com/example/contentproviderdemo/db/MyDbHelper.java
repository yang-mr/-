package com.example.contentproviderdemo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created on 2017/10/2917:40.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class MyDbHelper extends SQLiteOpenHelper {
    private final static String DB_name = "jack.db";

    public static final String CREATE_BOOK = "create table book ("

            + "id integer primary key autoincrement, "
            + "author text, "
            + "name text)";
    public static final String CREATE_FOOT = "create table foot ("

            + "id integer primary key autoincrement, "
            + "name text, "
            + "desc text)";
    public MyDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BOOK);
        db.execSQL(CREATE_FOOT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS book");
        db.execSQL("DROP TABLE IF EXISTS foot");
        onCreate(db);
    }
}
