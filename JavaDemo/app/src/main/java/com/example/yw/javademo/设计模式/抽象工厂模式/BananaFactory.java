package com.example.yw.javademo.设计模式.抽象工厂模式;

import com.example.yw.javademo.设计模式.工厂方法模式.普通工厂方法模式.Fruit;

/**
 * Created on 2017/11/923:27.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class BananaFactory implements IFactory {
    @Override
    public Fruit produce() {
        return new com.example.yw.javademo.设计模式.工厂方法模式.普通工厂方法模式.Banana();
    }
}
