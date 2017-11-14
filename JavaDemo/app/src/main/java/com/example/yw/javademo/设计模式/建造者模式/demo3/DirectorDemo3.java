package com.example.yw.javademo.设计模式.建造者模式.demo3;

/**
 * Created on 2017/11/1115:58.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class DirectorDemo3 {
    Builder builder;
    public DirectorDemo3(Builder builder) {
        this.builder = builder;
    }

    public void construct(String to, String from) {
        builder.builderTo(to);
        builder.builderFrom(from);
        builder.builderBody();
        builder.builderSendDate();
        builder.builderSubject();
    }
}
