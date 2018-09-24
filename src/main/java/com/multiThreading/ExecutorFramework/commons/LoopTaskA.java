package com.multiThreading.ExecutorFramework.commons;

import java.util.concurrent.TimeUnit;

/**
 * @author prem chand shah on 10-08-2018
 * @project myJava
 */
public class LoopTaskA implements Runnable {
    private static int count;
    private int id;

    @Override
    public void run() {
        System.out.println("### Start of task" + id);
        for (int i = 0; i < 10; i++) {
            System.out.println("Task id " + id + " Tick Tick");
            try {
                TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("### End of task" + id);
    }

    public LoopTaskA() {
        this.id = ++count;
    }
}


