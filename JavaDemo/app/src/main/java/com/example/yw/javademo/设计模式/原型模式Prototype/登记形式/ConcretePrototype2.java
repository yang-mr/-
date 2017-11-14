package com.example.yw.javademo.设计模式.原型模式Prototype.登记形式;

/**
 * Created on 2017/11/1116:34.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ConcretePrototype2 implements Prototype1 {
    private String name;

    @Override
    public Prototype1 clone() {
        Prototype1 prototype1 = new ConcretePrototype2();
        return prototype1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
