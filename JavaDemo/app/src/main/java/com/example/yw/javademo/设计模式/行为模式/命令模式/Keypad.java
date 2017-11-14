package com.example.yw.javademo.设计模式.行为模式.命令模式;

/**
 * Created on 2017/11/1218:13.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Keypad {
    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    public Command getPlayCommand() {
        return playCommand;
    }

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public Command getRewindCommand() {
        return rewindCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public Command getStopCommand() {
        return stopCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    /**
     * 执行播放方法
     */
    public void play(){
        playCommand.exe();
    }
    /**
     * 执行倒带方法
     */
    public void rewind(){
        rewindCommand.exe();
    }
    /**
     * 执行播放方法
     */
    public void stop(){
        stopCommand.exe();
    }
}
