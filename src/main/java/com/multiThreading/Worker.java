package com.multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/**
 * @author prem chand shah on 15-04-2018
 * @project myJava
 */
public class Worker {

    Random random = new Random();

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    /**
     * when we use synchronized method of any object then it applies Intrinsic lock on object
     * Whenever we synchronize any object we get an Intrinsic Lock on that object
     * at one only one method can have this lock so another method has to wait for it to get free, that is the
     * reason synchronized object take more time for execution but give accurate result in multithreading
     */

    /**
     * Explicit Vs Intrinsic Locks in Java ?
     * Why is Synchronized block better than synchronized method?
     * diff between Synchronized block and synchronized method?
     */

    public void stageOne() {

        /**Synchronized block*/
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }

//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        list1.add(random.nextInt(100));
    }


    /**
     * Synchronized method
     */
//    public synchronized void stageOne() {
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        list1.add(random.nextInt(1);
//    }

    public void stageTwo() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        list2.add(random.nextInt(100));
    }

    public void process() {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }

    }

    public void main() {
        System.out.println("starting ...");
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
        System.out.println("List1 size " + list1.size() + "  List2 size " + list2.size());
    }
}
