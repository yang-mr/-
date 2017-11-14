package com.example.yw.javademo.设计模式.行为模式.中介者模式;

/**
 * Created on 2017/11/1215:20.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ConcreteMediator extends AbstractMediator {
    public ConcreteMediator(AbstractColleague a1, AbstractColleague b1) {
        super(a1, b1);
    }

    @Override
    public void operateA() {
        int numberA = a1.getNumber();
        b1.setNumber(numberA / 100);
    }

    @Override
    public void operateB() {
        int numberB = b1.getNumber();
        a1.setNumber(numberB * 100);
    }
}
