package com.DurgaMultiThreading;

/**
 * @author prem chand shah on 09-08-2018
 * @project myJava
 */


/**
 * Life cycle of thread
 * myThread t = new myThread() - > thread creation state -> t.start() -> ready/runnable state -> Thread scheduler allocate processor to thread -> running state
 * -> after run() method completes -> dead state
 *
 * Runtime Excp : If thread is started and in between we are trying to start thread again then it will give IllegalThreadStateException
 *
 */


public class Mythread extends Thread {

    @Override
    public void run() {
        System.out.println("This is run method called by Thread class");
    }

    // this will be normal method, overloading of run method is valid
    public void run(String s) {
        System.out.println("Run method that will be called by class object");
    }

    // new thread will be not be created, it will be like normal method as start method of Thread class is not called as child method get
    // higher priority
    @Override
    public void start() {
        // this will call start method of Thread class and it will invoke run method of class
        super.start();
        super.start();
        System.out.println("Override start method, will prevent creation of new thread");
    }

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();
        System.out.println("This is MAIN method");
    }
}
