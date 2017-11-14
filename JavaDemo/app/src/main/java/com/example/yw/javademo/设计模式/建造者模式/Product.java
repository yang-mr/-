package com.example.yw.javademo.设计模式.建造者模式;

/**
 * Created on 2017/11/1114:06.
 * Author jackyang
 * -------------------------------
 *
 * @description  要创建的产品
 * @email 3180518198@qq.com
 */

public class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
