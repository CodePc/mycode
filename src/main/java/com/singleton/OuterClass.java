package com.singleton;

/**
 * @author prem chand shah on 04-05-2018
 * @project myJava
 */
public class OuterClass {
    private static String msg = "GeeksForGeeks";
    private String nonStaticMsg = "nonStaticMsg";

    // Static nested class
    public static class NestedStaticClass {

        // Only static members of Outer class is directly accessible in nested
        // static class
        public void printMessage() {

            // Try making 'message' a non-static variable, there will be
            // compiler error
            System.out.println("Message from nested static class: " + msg);

            // this will give error as we are trying to access non static variable in static inner class
//            System.out.println("Message from non-static nested class: " + nonStaticMsg);
        }
    }

    // non-static nested class - also called Inner class
    public class InnerClass {

        // Both static and non-static members of Outer class are accessible in
        // this Inner class
        public void display() {
            System.out.println("Message from non-static nested class: " + msg);
            System.out.println("Message from non-static nested class: " + nonStaticMsg);
        }
    }
}
