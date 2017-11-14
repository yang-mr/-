package com.example.yw.javademo.设计模式.行为模式.命令模式;

/**
 * Created on 2017/11/1218:09.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class PlayCommand extends Command {

    public PlayCommand(AudioPlayer player) {
        super(player);
    }
    @Override
    public void exe() {
        player.play();
    }
}
