package com.example.yw.javademo.设计模式.代理模式.动态代理;

/**
 * Created by root on 17-11-27.
 *
 * @DESCRIPTION --------------------
 */

public class Main {
    public static void main(String[] args) {
      //  test1();
        test2();
    }

    private static void test1() {
        ProxyHandler proxyHandler = new ProxyHandler(new Start());
        IStart proxy = (IStart) proxyHandler.getProxt();
        proxy.move();
        proxy.tea();
    }

    private static void test2() {
        ProxyHandler proxyHandler = new ProxyHandler(new OtherStart());
        IIIStart proxy = (IIIStart) proxyHandler.getProxt();
        proxy.ii();
        proxy.move();
        proxy.tea();
    }
}
