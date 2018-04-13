package com.code;

/**
 * Created by prem on 4/25/2017.
 */
public class ConstructorChaining {
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    ConstructorChaining() {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    ConstructorChaining(int x) {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    ConstructorChaining(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes default constructor first
        new ConstructorChaining();
    }
}
