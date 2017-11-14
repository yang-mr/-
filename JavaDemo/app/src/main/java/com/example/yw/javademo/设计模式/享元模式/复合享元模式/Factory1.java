package com.example.yw.javademo.设计模式.享元模式.复合享元模式;

import java.util.HashMap;
import java.util.List;

/**
 * Created on 2017/11/1123:08.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Factory1 {
    private HashMap<Character, FlyWeight1> map = new HashMap<>();

    public FlyWeight1 getFlyWeight(Character character) {
        FlyWeight1 flyWeight = map.get(character);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyWeight1(character);
            map.put(character, flyWeight);
        }
        return flyWeight;
    }

    public FlyWeight1 getCompositeFlyWeight(List<Character> list) {
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();
        for (Character c : list) {
            concreteCompositeFlyweight.add(c, this.getFlyWeight(c));
        }
        return concreteCompositeFlyweight;
    }
}
