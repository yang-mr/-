package com.example.yw.javademo.设计模式.代理模式.动态代理;

/**
 * Created by root on 17-11-27.
 *
 * @DESCRIPTION --------------------
 */

public class OtherStart implements IIIStart {

    @Override
    public void move() {
        System.out.println("otherStart--- move");
    }

    @Override
    public void tea() {
        System.out.println("otherStart--- tea");
    }

    @Override
    public void ii() {
        System.out.println("otherStart--- ii");
    }
}
