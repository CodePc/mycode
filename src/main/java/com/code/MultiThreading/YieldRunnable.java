package com.code.MultiThreading;

/**
 * Created by prem on 5/13/2017.
 */
public class YieldRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Current thread:" + Thread.currentThread().getName() + " " + "Priority: " + Thread.currentThread().getPriority());
        Thread.yield(); // give the chance for there with equal priority which is waiting in thread pool
        System.out.println("Current thread:" + Thread.currentThread().getName() + " " + "Priority: " + Thread.currentThread().getPriority() + " End");

    }
}
