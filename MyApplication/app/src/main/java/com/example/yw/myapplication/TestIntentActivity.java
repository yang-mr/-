package com.example.yw.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.nio.ByteBuffer;

public class TestIntentActivity extends AppCompatActivity {
    private final static String TAG = "TestByteBufferActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intent);

        testByteBuffer();
    }

    /**
     * Created from 2018/1/14 09:14
     * Author jackyang
     * ------------------
     * @desc  缓存区 高效的存取
     * @param
     * @return
     */
    private void testByteBuffer() {
        String content = "testBuffer";
        ByteBuffer byteBuffer = ByteBuffer.wrap(content.getBytes());
        Log.d(TAG, "byteBuffer's position: " + byteBuffer.position());

        byte getContent = byteBuffer.get(); // position = position + 1
        Log.d(TAG, "byteBuffer's position: " + byteBuffer.position() + " get byte: " + getContent);

        getContent = byteBuffer.get();
        Log.d(TAG, "byteBuffer's position: " + byteBuffer.position() + " get byte: " + getContent);

        byteBuffer.flip();
        byteBuffer.reset();
        Log.d(TAG, "byteBuffer's position: " + byteBuffer.position());

        byteBuffer.mark();
    }
}
