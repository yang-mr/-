package com.example.yw.javademo.设计模式.原型模式Prototype.clone;

import java.io.Serializable;

/**
 * Created on 2017/11/1117:01.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Staff implements Serializable{
    private int height = 100;

    public void grow() {
        this.height *= 2;
    }

    public void shrink() {
        this.height /= 2;
    }
}
