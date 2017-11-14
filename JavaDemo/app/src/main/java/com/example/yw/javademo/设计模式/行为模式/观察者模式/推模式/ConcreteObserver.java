package com.example.yw.javademo.设计模式.行为模式.观察者模式.推模式;

/**
 * Created on 2017/11/1216:22.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ConcreteObserver implements Observer {
    @Override
    public void update(String state) {
        System.out.print("我接到通知啦");
    }
}
