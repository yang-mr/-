package com.example.yw.javademo.设计模式.行为模式.状态模式;

/**
 * Created on 2017/11/1322:50.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class StatusManager {
    private Status status;

    public void handler(int i) {
        if (i > 10) {
            status = new AStatus();
        } else {
            status = new BStatus();
        }
        status.handler();
    }
}
