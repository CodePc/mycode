package com.DurgaMultiThreading;

/**
 * @author prem chand shah on 09-08-2018
 * @project myJava
 */

/**
 * Thread priority
 * int maxPriority = Thread.MAX_PRIORITY; // 10
 * int minPriority = Thread.MIN_PRIORITY; // 1
 * int normPriority = Thread.NORM_PRIORITY; // 5
 * Default priority only for MAIN thread is NORM_PRIORITY (5)
 * For all other thread priority is inherited from parent thread to child thread
 * Thread tt=new Thread();
 * System.out.println(Thread.currentThread().getPriority());
 * Thread.currentThread().setPriority(2);
 * tt.setPriority(1); // range is 1-10, It will give illegalArgument Exception
 * System.out.println(Thread.currentThread().getPriority());
 * System.out.println(tt.getPriority());
 */

public class ThreadPriority extends Thread {

    public void run() {
        System.out.println("Child thread priority " + Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println("This is child thread with set priority 10");
        }
    }

    public static void main(String[] args) {
        ThreadPriority threadPriority = new ThreadPriority();
        // thread pr
        threadPriority.setPriority(10); // before setting priority will be 5 for both child and parent thread as MAIN is parent thread
        threadPriority.start();

        System.out.println("Main thread priority " + Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println("This is main class with priority 5");
        }
    }
}
