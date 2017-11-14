package com.example.yw.javademo.设计模式.行为模式.责任链模式;

/**
 * Created on 2017/11/1217:05.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class GeneralManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        if (fee >= 1000) {
            System.out.print(hint + " 处理啦");
        }
        return null;
    }
}
