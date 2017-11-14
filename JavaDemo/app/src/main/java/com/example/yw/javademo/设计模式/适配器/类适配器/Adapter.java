package com.example.yw.javademo.设计模式.适配器.类适配器;

/**
 * Created on 2017/11/1119:51.
 * Author jackyang
 * -------------------------------
 *
 * @description 适配器类，继承了被适配类，同时实现标准接口
 * @email 3180518198@qq.com
 */

public class Adapter extends Adaptee implements Target {
    public void request() {
        super.specificRequest();
    }
}
