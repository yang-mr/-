package com.example.yw.javademo.设计模式.行为模式.备忘录模式.白箱;

/**
 * Created on 2017/11/1217:37.
 * Author jackyang
 * -------------------------------
 *
 * @description 备忘录 保存发起人类里的信息
 * @email 3180518198@qq.com
 */

public class Memento {
    private String status;

    public Memento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
