package com.example.yw.javademo.设计模式.行为模式.策略模式;

/**
 * Created on 2017/11/1322:38.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class AStrategy implements Strategy {
    @Override
    public int handler(int before) {
        return before / 2;
    }
}
