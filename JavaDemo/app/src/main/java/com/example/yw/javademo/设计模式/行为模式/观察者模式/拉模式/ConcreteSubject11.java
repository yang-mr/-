package com.example.yw.javademo.设计模式.行为模式.观察者模式.拉模式;

/**
 * Created on 2017/11/1216:21.
 * Author jackyang
 * -------------------------------
 *
 * @description 具体的被观察者
 * @email 3180518198@qq.com
 */

public class ConcreteSubject11 extends Subject1 {
    private String state;

    public ConcreteSubject11(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void change() {
        this.notifyObservers();
    }
}
