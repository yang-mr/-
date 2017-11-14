package com.example.yw.javademo.设计模式.行为模式.观察者模式.Java中的观察者;

import java.util.Observable;
import java.util.Observer;

/**
 * Created on 2017/11/1216:52.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Watcher implements Observer {
    public Watcher() {
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态发生改变：" + ((Watched)o).getStatus());
    }
}
