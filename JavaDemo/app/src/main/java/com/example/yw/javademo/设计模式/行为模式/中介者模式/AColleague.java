package com.example.yw.javademo.设计模式.行为模式.中介者模式;

/**
 * Created on 2017/11/1215:26.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class AColleague extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator mediator) {
        super.setNumber(number);
        mediator.operateA();
    }
}
