package com.example.yw.javademo.设计模式.行为模式.命令模式;

/**
 * Created on 2017/11/1218:09.
 * Author jackyang
 * -------------------------------
 *
 * @description 命令抽象类
 * @email 3180518198@qq.com
 */

public abstract class Command {
    public AudioPlayer player;
    public Command(AudioPlayer player) {
        this.player = player;
    }

    public abstract void exe();
}
