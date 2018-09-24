package com.singleton;

/**
 * @author prem chand shah on 04-05-2018
 * @project myJava
 */
public class UseSingleton {
    public static void main(String[] args) {

        /** cannot create a new Instance of singleton as this is not default public constructor but it is defined
         * as private constructor */
//         Singleton singleton = new Singleton();

        /**this is the correct way as getInstance() is a static method which is part of class*/
        Singleton.getInstance();


        /** Here every time we will get same instance of class*/
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Even this should not be allowed make singleton variable as private
//        Singleton ss = Singleton.singleton;
    }
}
