package com.example.yw.javademo.设计模式.建造者模式;

/**
 * Created on 2017/11/1114:10.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ConcreteBuilder implements Builder {
    private Product product = new Product();
    @Override
    public void buildName() {
        product.setName("轮子");
    }

    @Override
    public void buildPrice() {
        product.setPrice(100);
    }

    @Override
    public Product retrieveProduct() {
        return product;
    }
}
