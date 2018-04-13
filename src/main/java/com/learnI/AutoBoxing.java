package com.learnI;

/**
 * Created by prem on 5/14/2017.
 */
public class AutoBoxing {
    public static void autoBoxing() {
        Integer i = new Integer(200);
        int ii = i.intValue(); // we are getting primitive from Integer object
        int j = ii + 100; //  manipulating primitive type
        // Wrapper class is immutable, this is nothing but creating a new object which refer to i
        i = new Integer(j); // Rapper primitive to Integer object


        //------------ Instead of doing all the extra spet in above to box and unbox object to primitive and vice versa
        // we can to --- Auto-Boxing-------------

        //compiler will take care of all the extra steps done in above compiler so this is call Auto-boxing
        // we can use all the object with auto boxing
        Integer ageObj = new Integer(45);
        ageObj = ageObj + 20;

    }

    public static void main(String[] args) {

    }
}
