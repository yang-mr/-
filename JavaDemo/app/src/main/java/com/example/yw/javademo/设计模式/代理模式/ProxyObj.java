package com.example.yw.javademo.设计模式.代理模式;

/**
 * Created on 2017/11/1122:24.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ProxyObj extends AbstractObj {
    RealObj realObj = new RealObj();
    @Override
    public void operate() {
        System.out.print("我是代理");
        realObj.operate();
    }
}
