package com.example.root.cachedemo;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.LruCache;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LruCache<String, Bitmap> lruCache = new LruCache<String, Bitmap>(100) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getByteCount();
            }
            @Override
            public void trimToSize(int maxSize) {
                super.trimToSize(maxSize);
            }

            @Override
            public void resize(int maxSize) {
                super.resize(maxSize);
            }

            @Override
            protected void entryRemoved(boolean evicted, String key, Bitmap oldValue, Bitmap newValue) {
                super.entryRemoved(evicted, key, oldValue, newValue);
            }

            @Override
            protected Bitmap create(String key) {
                return super.create(key);
            }
        };

        lruCache.put("hint", null);
    }

}
