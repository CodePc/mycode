package com.learnI;

/**
 * @author prem chand shah on 20-04-2018
 * @project myJava
 */

/**
 * Call just before destroying any object or GC
 * If we call GC explicitly finalize block gets called
 */


public class FinalizeExample {

    public void finalize() {
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        FinalizeExample f1 = new FinalizeExample();
        FinalizeExample f2 = new FinalizeExample();
        f1 = null;
        f2 = null;
        System.gc();
    }
}
