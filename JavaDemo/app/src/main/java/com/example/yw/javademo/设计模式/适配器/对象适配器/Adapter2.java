package com.example.yw.javademo.设计模式.适配器.对象适配器;

import com.example.yw.javademo.设计模式.适配器.类适配器.Adaptee;
import com.example.yw.javademo.设计模式.适配器.类适配器.Target;

/**
 * Created on 2017/11/1120:04.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Adapter2 implements Target {

    private Adaptee adaptee;
    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
