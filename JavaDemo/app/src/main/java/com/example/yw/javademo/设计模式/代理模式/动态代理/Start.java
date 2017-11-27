package com.example.yw.javademo.设计模式.代理模式.动态代理;

/**
 * Created by root on 17-11-27.
 *
 * @DESCRIPTION --------------------
 */

public class Start implements IStart {
    @Override
    public void move() {
        System.out.println("start-----move");
    }

    @Override
    public void tea() {
        System.out.println("start-----tea");
    }
}
