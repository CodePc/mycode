package com.learnI;

/**
 * Created by prem on 4/16/2017.
 */
public abstract class AbstractClass {
    public void nonAbstractMethod() {
        System.out.println("Abstract class can have non abstract method but not vice versa" +
                "but any class that has atleast one abstract class should be  abstract class");
    }

     abstract void abstractMethodCannotHaveImplementation();
//
    public abstract void abstractMethodCannotHaveImplementationTwo();

    AbstractClass() {
        System.out.println("\"abstract class constructor invokes only when subclass object is created\"");
    }

    public static void main(String[] args) {
//        AbstractClass abstractClass = new AbstractClass() // this is illegal statement

    }
}
