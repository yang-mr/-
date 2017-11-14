package com.example.yw.javademo.设计模式.享元模式.单纯享元模式;

import java.util.HashMap;

/**
 * Created on 2017/11/1123:08.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Factory {
    private HashMap<Character, FlyWeight> map = new HashMap<>();

    public FlyWeight getFlyWeight(Character character) {
        FlyWeight flyWeight = map.get(character);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyWeight(character);
            map.put(character, flyWeight);
        }
        return flyWeight;
    }
}
