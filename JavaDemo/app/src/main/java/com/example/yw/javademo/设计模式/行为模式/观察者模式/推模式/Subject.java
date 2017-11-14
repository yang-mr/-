package com.example.yw.javademo.设计模式.行为模式.观察者模式.推模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/11/1216:17.
 * Author jackyang
 * -------------------------------
 *
 * @description 被观察者 抽象
 * @email 3180518198@qq.com
 */

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(0, observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String newState) {
        for (Observer o : observers) {
            o.update(newState);
        }
    }
}
