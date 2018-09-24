package com.singleton;

/**
 * @author prem chand shah on 04-05-2018
 * @project myJava
 */
public final class Singleton {

    /**
     * here Singleton is static as we will be using in static method
     */
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null)
            return new Singleton();
        else return singleton;
    }


    //Thread Synchronized Java implementation of
    // singleton design pattern
    // Only one thread can execute this at a time
    public static synchronized Singleton getSyncInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }


//   // Method 3: Eager Instantiation
//
//    // Static initializer based Java implementation of
//// singleton design pattern
//    class Singleton
//    {
//        private static Singleton obj = new Singleton();
//
//        private Singleton() {}
//
//        public static Singleton getInstance()
//        {
//            return obj;
//        }
//    }

    /**
     * Here ^ we have created instance of singleton in static initializer.
     * JVM executes static initializer when the class is loaded and hence this is guaranteed to be thread safe.
     * Use this method only when your singleton class is light and is used throughout the execution of your program.*/


//    Method 4 (Best): Use “Double Checked Locking”
//    If you notice carefully once an object is created synchronization is no longer useful because now obj will not be null and any sequence of operations will lead to consistent results.
//    So we will only acquire lock on the getInstance() once, when the obj is null. This way we only synchronize the first way through, just what we want.

    // Double Checked Locking based Java implementation of
// singleton design pattern


//    class SingletonDoubleCheck
//    {
//        private volatile static Singleton obj;
//
//        private SingletonDoubleCheck() {}
//
//        public static Singleton getInstance()
//        {
//            if (obj == null)
//            {
//                // To make thread safe
//                synchronized (Singleton.class)
//                {
//                    // check again as multiple threads
//                    // can reach above step
//                    if (obj==null)
//                        obj = new Singleton();
//                }
//            }
//            return obj;
//        }
//    }

}


