package com.example.yw.javademo.多线程.copyonwritearraylist;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created on 2017/11/15  10:35.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class CopyWriteArrayListDemo {

    public static void main(String[] args){
        List<Integer> l = Arrays.asList(new Integer[]{2, 3, 4});
        CopyOnWriteArrayList list = new CopyOnWriteArrayList(new Integer[]{2, 3, 4});

        //模拟多线程操作
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new ReadThread(list));
        executorService.execute(new WriteThread(list));
        executorService.execute(new ReadThread(list));
        executorService.execute(new WriteThread(list));
        executorService.execute(new WriteThread(list));
    }
}
