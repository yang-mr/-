package com.example.yw.javademo.设计模式.建造者模式.demo3;

import java.util.Date;

/**
 * Created on 2017/11/1115:51.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public abstract class Builder {
    public AutoMessage autoMessage;

    public abstract void builderSubject();
    public abstract void builderBody();

    public void builderTo(String to) {
        autoMessage.setTo(to);
    }

    public void builderFrom(String from) {
        autoMessage.setFrom(from);
    }

    public void builderSendDate() {
        autoMessage.setSendDate(new Date());
    }
}
