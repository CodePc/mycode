package com.multiThreading.executerService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author prem chand shah on 15-04-2018
 * @project myJava
 */
public class Processor implements Runnable {
    private int id;

    public Processor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting: " + id);

        try {
            Thread.sleep(5000);

            System.out.println("Thread -- > " + Thread.currentThread());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("completed " + id);
    }
}

class App {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Processor(i));
        }
        executorService.shutdown();
        System.out.println("All task submitted");
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All task completed");
    }
}




