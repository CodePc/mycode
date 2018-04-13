package com.code.MultiThreading;

/**
 * Created by prem on 5/13/2017.
 */
public class JoinThreadDemo implements Runnable {
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("First thread")) {
            try {
                System.out.println(System.nanoTime() + "Inside the join condition..");
                JoinDemoExe.secondThread.start();
                JoinDemoExe.secondThread.join(); // stop execution of 1st thread unless 2nd thread execution is completed
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
