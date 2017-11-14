package com.example.yw.javademo.设计模式.行为模式.责任链模式;

/**
 * Created on 2017/11/1217:04.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class ProjectManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        if (fee < 500) {
            System.out.print(hint + " 处理啦");
        } else {
            Handler handler = getSuccessor();
            if (handler != null) {
                handler.handleFeeRequest(user, fee);
            }
        }
        return null;
    }
}
