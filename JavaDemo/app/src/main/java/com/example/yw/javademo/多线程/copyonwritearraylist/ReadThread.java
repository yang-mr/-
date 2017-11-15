package com.example.yw.javademo.多线程.copyonwritearraylist;

import java.util.List;

/**
 * Created on 2017/11/15  10:37.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class ReadThread implements Runnable {
    private List<Integer> list;

    public ReadThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
