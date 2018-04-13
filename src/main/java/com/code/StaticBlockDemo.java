package com.code;

/**
 * Created by prem on 4/24/2017.
 */

/*Java supports a special block, called static block (also called static clause) which can be used for static initializations of a class.
 This code inside static block is executed only once: the first time you
 make an object of that class or the first time you access a static member of that class (even if you never make an object of that class).
 For example, check output of following Java */
public class StaticBlockDemo {
    static int i;
    int j;

    // start of static block
    void nonStatic() {
        System.out.println("non Static method");
//        static int p = 20;  Invalid because local static member is not allowed

    }

    static void staticMethod() {
        System.out.println("Static method");
    }

    static {
        i = 10;
        System.out.println("static block called ");
        staticMethod();// this is valid as method is static
//        nonStatic(); // Invalid: because no static member/ method cannot be inside static block
//        j=12; // Invalid : same reason as above
    }
    // end of static block


    public static void main(String args[]) {
        //StaticBlockDemo staticBlockDemo = new StaticBlockDemo();
        // Although we don't have an object of Test, static block is
        // called because i is being accessed in following statement.
        System.out.println("Static block is called 1st ");
        System.out.println(StaticBlockDemo.i);
    }
}
