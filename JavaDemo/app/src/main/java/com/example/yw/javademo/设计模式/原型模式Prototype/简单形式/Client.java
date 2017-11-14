package com.example.yw.javademo.设计模式.原型模式Prototype.简单形式;

/**
 * Created on 2017/11/1116:27.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operate() {
        Prototype type = (Prototype) prototype.clone();
    }
}
