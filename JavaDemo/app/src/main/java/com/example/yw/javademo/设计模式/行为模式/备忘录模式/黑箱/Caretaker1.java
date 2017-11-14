package com.example.yw.javademo.设计模式.行为模式.备忘录模式.黑箱;

/**
 * Created on 2017/11/1217:40.
 * Author jackyang
 * -------------------------------
 *
 * @description 保存备忘录
 * @email 3180518198@qq.com
 */

public class Caretaker1 {
    private IMemento1 memento1;
    /**
     * 备忘录的取值方法
     */
    public IMemento1 retrieveMemento(){
        return this.memento1;
    }
    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(IMemento1 memento1){
        this.memento1 = memento1;
    }
}
