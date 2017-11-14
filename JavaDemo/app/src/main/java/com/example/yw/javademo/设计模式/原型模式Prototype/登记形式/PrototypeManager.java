package com.example.yw.javademo.设计模式.原型模式Prototype.登记形式;

import com.example.yw.javademo.设计模式.原型模式Prototype.简单形式.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017/11/1116:35.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class PrototypeManager {
    private static Map<String, Prototype1> map = new HashMap<>();

    private PrototypeManager(){}

    public static synchronized void setPrototype1(String key, Prototype1 v) {
        map.put(key, v);
    }

    public static synchronized void removePrototype1(String key) {
        if (map.containsKey(key)) {
            map.remove(key);
        } else {
            throw new IllegalArgumentException("不存在该对象");
        }
    }

    public static synchronized Prototype1 getPrototype1(String key) {
        Prototype1 prototype1 = map.get(key);
        if (prototype1 == null) {
            throw new IllegalArgumentException("不存在该原型");
        }
        return prototype1;
    }
}
