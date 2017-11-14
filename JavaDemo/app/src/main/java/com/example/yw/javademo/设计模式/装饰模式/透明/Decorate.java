package com.example.yw.javademo.设计模式.装饰模式.透明;

/**
 * Created on 2017/11/1122:36.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Decorate implements Fruit {
    private Fruit fruit;
    public Decorate(Fruit fruit) {
        this.fruit = fruit;
    }
    @Override
    public void getName() {
        fruit.getName();
    }
}
