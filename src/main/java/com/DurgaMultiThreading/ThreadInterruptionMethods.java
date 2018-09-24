package com.DurgaMultiThreading;

/**
 * @author prem chand shah on 09-08-2018
 * @project myJava
 * We can prevent thread execution by using following method
 * yield() -> to pass execution for current waiting thread with same priority, if low/no prp thread is waiting then it will continue its exc
 * join() -> thread(t1) which want to wait for another thread(t2) to wait then the t1 thread have to invoke join() method on t2
 * sleep()
 */
public class ThreadInterruptionMethods extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Thread.yield(); // give execution to waiting thread with same priority
        }
    }

    public static void main(String[] args) {
        ThreadInterruptionMethods t = new ThreadInterruptionMethods();
        t.start();
        try {
            t.join(); // main thread as invoked t.join() so main thread will wait until t1 thread get completed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }

    }
}
