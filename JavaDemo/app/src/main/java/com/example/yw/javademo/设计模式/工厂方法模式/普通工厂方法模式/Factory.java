package com.example.yw.javademo.设计模式.工厂方法模式.普通工厂方法模式;

/**
 * Created on 2017/11/923:02.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Factory {
    public Fruit produce(String type) {
        Fruit result = null;
        switch (type) {
            case "香蕉":
                result = new Banana();
                break;
            case "橘子":
                result = new Orange();
                break;
        }
        return result;
    }
}
