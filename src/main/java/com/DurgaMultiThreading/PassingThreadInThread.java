package com.DurgaMultiThreading;

/**
 * @author prem chand shah on 09-08-2018
 * @project myJava
 */
public class PassingThreadInThread extends Thread {

    @Override
    public void run() {
        System.out.println("child thread");
    }

    public static void main(String[] args) {
        PassingThreadInThread passingThreadInThread = new PassingThreadInThread();
        Thread t = new Thread(passingThreadInThread); // there we can pass thread class object as well instead on runnable as thread implements runnable
        t.start();

        System.out.println("This is main thread");

    }
}
