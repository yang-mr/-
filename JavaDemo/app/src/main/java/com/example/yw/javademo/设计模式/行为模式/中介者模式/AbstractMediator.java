package com.example.yw.javademo.设计模式.行为模式.中介者模式;

/**
 * Created on 2017/11/1215:20.
 * Author jackyang
 * -------------------------------
 *
 * @description 抽象的中介者
 * @email 3180518198@qq.com
 */

public abstract class AbstractMediator {
    public AbstractColleague a1;
    public AbstractColleague b1;

    public AbstractMediator(AbstractColleague a1, AbstractColleague b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    /**
     * Created from 2017/11/12 15:23
     * Author jackyang
     * ------------------
     * @desc 影响A
     */
    public abstract void operateA();

    public abstract void operateB();
}
