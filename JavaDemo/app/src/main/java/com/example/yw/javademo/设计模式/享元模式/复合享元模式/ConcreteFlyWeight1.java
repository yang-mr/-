package com.example.yw.javademo.设计模式.享元模式.复合享元模式;

/**
 * Created on 2017/11/1123:06.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ConcreteFlyWeight1 implements FlyWeight1 {
    private Character status;
    public ConcreteFlyWeight1(Character status) {
        this.status = status;
    }
    @Override
    public void operate(String status) {
        System.out.print("内部的status:" + this.status);
        System.out.print("外部的status:" + status);
    }
}
