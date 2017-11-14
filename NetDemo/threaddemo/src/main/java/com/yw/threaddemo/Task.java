package com.yw.threaddemo;

/**
 * Created on 2017/11/222:22.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class Task {
    private IDoTask mIDoTask;
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public Task(int num) {
        this.num = num;
    }

    public void setmIDoTask(IDoTask mIDoTask) {
        this.mIDoTask = mIDoTask;
    }

    public Task(IDoTask iDoTask) {
        this.mIDoTask = iDoTask;


    }

    public void start() {
        new Runnable() {
            @Override
            public void run() {
                try {
                  //  Thread.sleep(1000);

                    if (mIDoTask != null) {
                        mIDoTask.doWork(num + 2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.run();
    }

    interface IDoTask {
        void doWork(int count);
    }
}
