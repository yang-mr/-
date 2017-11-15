package com.example.yw.javademo.多线程.copyonwritearraylist;

import java.util.List;

/**
 * Created on 2017/11/15  10:38.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class WriteThread extends Thread {
    private List<Integer> list;

    public WriteThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        list.add(10);
    }
}
