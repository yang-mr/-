package com.example.yw.javademo.设计模式.行为模式.备忘录模式.白箱;

/**
 * Created on 2017/11/1217:40.
 * Author jackyang
 * -------------------------------
 *
 * @description 保存备忘录
 * @email 3180518198@qq.com
 */

public class Caretaker {
    private Memento memento;
    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento(){
        return this.memento;
    }
    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento){
        this.memento = memento;
    }
}
