package com.learnI;

/**
 * Created by prem on 4/14/2017.
 */
public class StaticClassExample {
    public static class superclass {
        static void print() {
            System.out.println("print in superclass.");
        }
    }

    public static class subclass extends superclass {
        static void print() {
            System.out.println("print in subclass.");
        }
    }

    public static void main(String[] args) {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
        subclass.print();
    }
}
