package com.example.yw.javademo.设计模式.行为模式.责任链模式;

/**
 * Created on 2017/11/1217:03.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public abstract class Handler {
    public String hint = this.getClass().getName();
     //持有下一个处理请求的对象
    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     * @param user    申请人
     * @param fee    申请的钱数
     * @return        成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user , double fee);
}
