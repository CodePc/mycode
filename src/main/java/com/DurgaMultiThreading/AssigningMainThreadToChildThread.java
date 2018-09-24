package com.DurgaMultiThreading;

/**
 * @author prem chand shah on 09-08-2018
 * @project myJava
 */
public class AssigningMainThreadToChildThread extends Thread {
    static Thread t;

    public void run() {
        try {
            t.join(); // will for main thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }

    }

    public static void main(String[] args) {
        AssigningMainThreadToChildThread.t = Thread.currentThread();
        AssigningMainThreadToChildThread thread = new AssigningMainThreadToChildThread();
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }
    }
}
