package com.example.yw.javademo.设计模式.行为模式.中介者模式;

/**
 * Created on 2017/11/1215:19.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public abstract class AbstractColleague {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void setNumber(int number, AbstractMediator mediator);
}
