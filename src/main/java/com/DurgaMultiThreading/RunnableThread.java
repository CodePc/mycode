package com.DurgaMultiThreading;

/**
 * @author prem chand shah on 09-08-2018
 * @project myJava
 */
public class RunnableThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is child thread");
        }
    }

    public static void main(String[] args) {
        RunnableThread runnableObj = new RunnableThread();
        Thread runnableThread = new Thread(runnableObj, "Runnable thread object thread"); // target runnable, it will invoke run method of myrunnable class
        runnableThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("This is MAIN thread");
        }


        Thread t1 = new Thread();

        Thread t2 = new Thread(runnableObj);

        //case 1: new thread will be created as we are calling start method of thread
        t1.start();

        // case2: new thread will not be create as we are calling run method of runnable class (Thread class impl Runnable )directly
        t1.run();

        //case3: New thread will be created as this thread as a Runnable object as argument
        t2.start();

        //case4: No New thread will be created
        t2.run();

        // case5: Error : No symbol found
        runnableThread.start();

        // case6: No new thread will be created, it will be just a normal method call
        runnableThread.start();

        ThreadGroup group = t1.getThreadGroup();

        /**
         * Thread constructor*/

        Thread thread1 = new Thread();
        Thread thread2 = new Thread(runnableObj);
        Thread thread3 = new Thread("name of thread");
        Thread thread4 = new Thread(runnableObj, "Name of thread");
        Thread thread5 = new Thread(group, "name of thread");
        Thread thread6 = new Thread(group, runnableObj);
        Thread thread7 = new Thread(group, runnableObj, "Name of thread");
        Thread thread8 = new Thread(group, runnableObj, "Name of thread", new Long(20)); // stack size


    }
}
