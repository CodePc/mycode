package com.code;

/**
 * Created by prem on 4/25/2017.
 */

  /* Java program to show that if static method is redefined by
   a derived class, then it is not overriding. */

// Superclass
public class OverRidingStaticMethodNO {
    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }

    // Non-static method which will be overridden in derived class
    public void print() {
        System.out.println("Non-static or Instance method from Base");
    }
}

// Subclass
class Derived extends OverRidingStaticMethodNO {

    // This method hides display() in Base
    public static void display() {
        System.out.println("Static or class method from Derived");
    }

    // This method overrides print() in Base
    public void print() {
        System.out.println("Non-static or Instance method from Derived");
    }
}

class Test {
    public static void main(String args[]) {
        OverRidingStaticMethodNO obj1 = new Derived();

        // As per overriding rules this should call to class Derive's static
        // overridden method. Since static method can not be overridden, it
        // calls Base's display()
        obj1.display();

        // Here overriding works and Derive's print() is called
        obj1.print();
    }
}

