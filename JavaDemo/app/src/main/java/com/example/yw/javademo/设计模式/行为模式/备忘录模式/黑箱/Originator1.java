package com.example.yw.javademo.设计模式.行为模式.备忘录模式.黑箱;

/**
 * Created on 2017/11/1217:37.
 * Author jackyang
 * -------------------------------
 *
 * @description 发起人
 * @email 3180518198@qq.com
 */

public class Originator1 {
    private String status;

    public IMemento1 createMemento() {
        return new Memento(status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void restoreMemento(IMemento1 memento1){
        this.status = ((Memento)memento1).getState();
    }

    private class Memento implements IMemento1{

        private String state;
        /**
         * 构造方法
         */
        private Memento(String state){
            this.state = state;
        }

        private String getState() {
            return state;
        }
        private void setState(String state) {
            this.state = state;
        }
    }
}
