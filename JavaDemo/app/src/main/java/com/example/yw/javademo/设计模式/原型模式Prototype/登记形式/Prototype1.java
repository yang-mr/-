package com.example.yw.javademo.设计模式.原型模式Prototype.登记形式;

/**
 * Created on 2017/11/1116:32.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public interface Prototype1 {
    public Prototype1 clone();

    public String getName();
    public void setName(String name);
}
