package com.example.yw.javademo.设计模式.行为模式.策略模式;

/**
 * Created on 2017/11/1322:39.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class StrategyManager {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public StrategyManager() {
    }

    public int handler(int before) {
        if (strategy == null) {
            throw new IllegalArgumentException("请设置策略");
        }
       return strategy.handler(before);
    }
}
