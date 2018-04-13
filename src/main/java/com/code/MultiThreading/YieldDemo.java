package com.code.MultiThreading;

/**
 * Created by prem on 5/13/2017.
 */
public class YieldDemo {
    public static void main(String[] args) {
        YieldRunnable yieldDemo = new YieldRunnable();
        ThreadGroup threadGroup = new ThreadGroup("All thread Group");
        Thread t1 = new Thread(threadGroup, yieldDemo, "t1");
        Thread t2 = new Thread(threadGroup, yieldDemo, "t2");
        Thread t3 = new Thread(threadGroup, yieldDemo, "t3");
        Thread t4 = new Thread(threadGroup, yieldDemo, "t4");
        Thread t5 = new Thread(threadGroup, yieldDemo, "t5");
        Thread t6 = new Thread(threadGroup, yieldDemo, "t6");
        Thread t7 = new Thread(threadGroup, yieldDemo, "t7");
        Thread t8 = new Thread(threadGroup, yieldDemo, "t8");
        Thread t9 = new Thread(threadGroup, yieldDemo, "t9");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t6.setPriority(Thread.NORM_PRIORITY);


        t7.setPriority(Thread.MIN_PRIORITY);
        t8.setPriority(Thread.MIN_PRIORITY);
        t9.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

        // getting status of each thread

        while (true) {
            t1.getState();
            Thread.State stateT1 = t1.getState();
            Thread.State stateT2 = t2.getState();

            System.out.println(System.nanoTime() + "t1Status: " + stateT1);
            System.out.println(System.nanoTime() + "t2Status: " + stateT2);

            int activeThread = threadGroup.activeCount();
            if (activeThread == 0)
                break;
        }
    }
}
