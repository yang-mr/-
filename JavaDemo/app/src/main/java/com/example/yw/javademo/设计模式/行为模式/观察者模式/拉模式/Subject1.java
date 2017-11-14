package com.example.yw.javademo.设计模式.行为模式.观察者模式.拉模式;

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

public abstract class Subject1 {
    List<Observer1> observer1s = new ArrayList<>();

    public void add(Observer1 observer1) {
        observer1s.add(0, observer1);
    }

    public void remove(Observer1 observer1) {
        observer1s.remove(observer1);
    }

    public void notifyObservers() {
        for (Observer1 o : observer1s) {
            o.update(this);
        }
    }
}
