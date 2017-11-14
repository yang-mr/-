package com.example.yw.javademo.设计模式.享元模式.复合享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017/11/1123:19.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ConcreteCompositeFlyweight implements FlyWeight1 {
    private Map<Character, FlyWeight1> map = new HashMap<>();

    public void add(Character character, FlyWeight1 flyWeight1) {
        map.put(character, flyWeight1);
    }
    @Override
    public void operate(String status) {
        FlyWeight1 fly = null;
        for(Character o : map.keySet()){
            fly = map.get(o);
            fly.operate(status);
        }
    }
}
