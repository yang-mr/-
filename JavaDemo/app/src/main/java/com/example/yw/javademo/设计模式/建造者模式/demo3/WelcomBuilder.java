package com.example.yw.javademo.设计模式.建造者模式.demo3;

import com.example.yw.javademo.设计模式.建造者模式.demo3.Builder;

/**
 * Created on 2017/11/1115:53.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class WelcomBuilder extends Builder {

    public WelcomBuilder() {
        autoMessage = new WelcomeMessage();
    }

    @Override
    public void builderSubject() {
        autoMessage.setSubject("我是welcome里面的subject");
    }

    @Override
    public void builderBody() {
        autoMessage.setBody("我是welcome里面的body");
    }
}
