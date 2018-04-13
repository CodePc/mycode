package com.code.MultiThreading;

/**
 * Created by prem on 5/13/2017.
 */
public class JoinDemoExe {
    public static Thread firstThread;
    public static Thread secondThread;

    public static void main(String[] args) {
        JoinThreads joinThreads = new JoinThreads();
        firstThread = new Thread(firstThread, "First thread");
        secondThread = new Thread(secondThread, "Second thread");
        firstThread.start();
        while (true) {
            Thread.State firstThreadState = firstThread.getState();
            Thread.State secondThreadState = secondThread.getState();
            System.out.println(System.nanoTime() + "First Thread satus " + firstThreadState);
            System.out.println(System.nanoTime() + "Second Thread satus " + secondThreadState);
            if (firstThreadState.equals(Thread.State.TERMINATED) && secondThreadState.equals(Thread.State.TERMINATED))
                break;
        }
    }


    private static class JoinThreads {
    }
}
