package com.example.yw.javademo.设计模式.适配器.类适配器;

/**
 * Created on 2017/11/1119:54.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}
