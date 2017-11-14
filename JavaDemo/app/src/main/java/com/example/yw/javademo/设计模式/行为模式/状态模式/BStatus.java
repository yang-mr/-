package com.example.yw.javademo.设计模式.行为模式.状态模式;

/**
 * Created on 2017/11/1322:50.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class BStatus extends Status {
    @Override
    public void handler() {
        System.out.print("执行B状态");
    }
}
