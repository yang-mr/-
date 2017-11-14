package com.example.yw.javademo.设计模式.原型模式Prototype.简单形式;

/**
 * Created on 2017/11/1116:25.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ConcretePrototype implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype();
        return prototype;
    }
}
