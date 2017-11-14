package com.example.yw.javademo.设计模式.行为模式.观察者模式.推模式;

/**
 * Created on 2017/11/1216:21.
 * Author jackyang
 * -------------------------------
 *
 * @description 具体的被观察者
 * @email 3180518198@qq.com
 */

public class ConcreteSubject extends Subject {
    public void change(String newState) {
        this.notifyObservers(newState);
    }
}
