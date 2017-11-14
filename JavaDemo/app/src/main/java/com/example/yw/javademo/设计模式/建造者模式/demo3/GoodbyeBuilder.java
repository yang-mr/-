package com.example.yw.javademo.设计模式.建造者模式.demo3;

/**
 * Created on 2017/11/1115:56.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        autoMessage = new GoodbyeMessage();
    }
    @Override
    public void builderSubject() {
        autoMessage.setSubject("我是Goodbye里面的的subject");
    }

    @Override
    public void builderBody() {
        autoMessage.setBody("我是Goodbye里面的的body");
    }
}
