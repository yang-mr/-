package com.example.yw.javademo.设计模式.装饰模式.透明.demo1;

/**
 * Created on 2017/11/1122:38.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class OrangDecorate extends Orang {
    private Orang orang;
    public OrangDecorate(Orang orang) {
        this.orang = orang;
    }
    @Override
    public void getName() {
        orang.getName();
    }
}
