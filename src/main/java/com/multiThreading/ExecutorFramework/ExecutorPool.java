package com.multiThreading.ExecutorFramework;

import com.multiThreading.ExecutorFramework.commons.LoopTaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author prem chand shah on 10-08-2018
 * @project myJava
 */
public class ExecutorPool {

//    private static ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//    private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(20);
//    private static ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//    private static ExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args) {
        System.out.println("Start of MAIN thread");
        ExecutorService fixedThreadPool = Executors.newCachedThreadPool();
        fixedThreadPool.submit(new LoopTaskA());
        fixedThreadPool.submit(new LoopTaskA());
        fixedThreadPool.submit(new LoopTaskA());
        fixedThreadPool.submit(new LoopTaskA());
        fixedThreadPool.shutdown();

        fixedThreadPool.submit(new LoopTaskA());

        fixedThreadPool.submit(new LoopTaskA());
        System.out.println("End of MAIN thread");
    }
}
