package com.example.yw.javademo.设计模式.建造者模式;

/**
 * Created on 2017/11/1114:11.
 * Author jackyang
 * -------------------------------
 *
 * @description 面向客户
 * @email 3180518198@qq.com
 */

public class Director {
    /**
     * Created from 2017/11/11 14:12
     * Author jackyang
     * ------------------
     * @desc 持有当前建造器  使建造器不直接面对客户
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildName();
        builder.buildPrice();
    }
}
