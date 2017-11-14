package com.example.yw.javademo.泛型;

import com.example.yw.javademo.泛型.demo2.Fruit;

/**
 * Created on 2017/11/922:02.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Main {

    /**
     * Created from 2017/11/9 22:05
     * Author jackyang
     * ------------------
     * @desc 类型绑定：extends
     */
    public static <T extends Comparable> T min(T...a) {
        T smallest = a[0];
        for (T item : a) {
            if (smallest.compareTo(item)) {
                smallest = item;
            }
        }
        return smallest;
    }

    public static <T extends Fruit> String getName(T t) {
        return t.getName();
    }
}
