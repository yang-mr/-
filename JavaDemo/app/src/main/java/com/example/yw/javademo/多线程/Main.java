package com.example.yw.javademo.多线程;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created on 2017/11/15  16:47.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class Main {
    public static void main(String[] args) {

        testConcurrentHashMap();
    }

    /**
     * Author jackyang
     * created 2017/11/15 16:48
     * @desc ConcurrentHashMap 是线程安全的  按照key.hashcode值 分成TableMap
     */
    private static void testConcurrentHashMap() {
        final ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        new Thread("thread01") {
            @Override
            public void run() {
                super.run();
                map.put("rose", "女的");
            }
        }.start();
        new Thread("thread02") {
            @Override
            public void run() {
                super.run();
                map.put("JACK", "男的");
            }
        }.start();
        new Thread("thread03") {
            @Override
            public void run() {
                super.run();
                map.put("tom", "女的");
            }
        }.start();

        int size = map.size();

        while (size != 3) {
            size = map.size();
            System.out.println(size);
        }
    }
}
