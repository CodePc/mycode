package com.multiThreading;

import java.util.Scanner;

/**
 * @author prem chand shah on 11-04-2018
 * @project myJava
 */

class Runner extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Processor extends Thread {

    /**
     * here volatile keyword will ensure that the shared variable is not cached by running thread where it is not modified
     * in thread method but modified from other method
     * <p>
     * If changing a variable from other thread use volatile to ensure that shared variable is not cached
     */
    private volatile boolean running = true;

    public void run() {
        while (running) {
            int threadCount = 0;
            System.out.println("Thread " + threadCount);
            threadCount++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}

public class App {

    public static void main(String[] args) {
//        Runner runner = new Runner();
//        runner.start();
//
//        Runner runner1 = new Runner();
//        runner1.start();


        /**for shared resource or variable*/

//        Processor proc1 = new Processor();
//        proc1.start();
//
//        System.out.println("Press return to stop process");
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//        proc1.shutdown();

        Worker worker = new Worker();
        worker.main();
    }

}
