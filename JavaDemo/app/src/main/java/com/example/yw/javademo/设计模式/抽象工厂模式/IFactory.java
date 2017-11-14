package com.example.yw.javademo.设计模式.抽象工厂模式;

import com.example.yw.javademo.设计模式.工厂方法模式.普通工厂方法模式.Fruit;

/**
 * Created on 2017/11/923:25.
 * Author jackyang
 * -------------------------------
 * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改
 * @description   闭包原则
 * @email 3180518198@qq.com
 */

public interface IFactory {
    public Fruit produce();
}
