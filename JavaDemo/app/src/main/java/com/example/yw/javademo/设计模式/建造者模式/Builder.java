package com.example.yw.javademo.设计模式.建造者模式;

/**
 * Created on 2017/11/1114:08.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public interface Builder {
    public void buildName();
    public void buildPrice();

    public Product retrieveProduct();
}
