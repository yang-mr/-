package com.example.yw.javademo.设计模式.行为模式.备忘录模式.白箱;

/**
 * Created on 2017/11/1217:37.
 * Author jackyang
 * -------------------------------
 *
 * @description 发起人
 * @email 3180518198@qq.com
 */

public class Originator {
    private String status;

    public Memento createMemento() {
        return new Memento(status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void restoreMemento(Memento memento){
        this.status = memento.getStatus();
    }
}
