package com.example.yw.javademo.设计模式.行为模式.命令模式;

/**
 * Created on 2017/11/1218:08.
 * Author jackyang
 * -------------------------------
 *
 * @description 接收者角色，由录音机类扮演
 * @email 3180518198@qq.com
 */

public class AudioPlayer {
    public void play(){
        System.out.println("播放...");
    }

    public void rewind(){
        System.out.println("倒带...");
    }

    public void stop(){
        System.out.println("停止...");
    }
}
