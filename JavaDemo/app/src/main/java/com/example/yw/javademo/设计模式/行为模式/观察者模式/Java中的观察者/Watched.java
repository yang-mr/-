package com.example.yw.javademo.设计模式.行为模式.观察者模式.Java中的观察者;

import java.util.Observable;

/**
 * Created on 2017/11/1216:50.
 * Author jackyang
 * -------------------------------
 *
 * @description  被观察者
 * @email 3180518198@qq.com
 */

public class Watched extends Observable {
    private String status = "";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (!this.status.equals(status)) {
            this.status = status;
            setChanged();
        }
        notifyObservers();
    }
}
