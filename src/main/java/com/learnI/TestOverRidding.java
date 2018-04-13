package com.learnI;

/**
 * Created by Prem Chand on 9/21/2016.
 */
public class TestOverRidding {
    void s() {
        System.out.println("Thi is super class");
    }
}

 /* overriding give more power to subclass by which they can override the super class method if they fill
      method in super class is not better*
      helps in reimplementation of method in superclass
       - In overridden method we cannot pass any arguments it should be same as method on superclass
       - Both overriding and overridden method should have same accessibility that will be perfect overriding
       - There should not be any throw exception for overridden method if there is no exception in main method
       - overriding class should be in subclass
       - Unchecked/runtime exception are allowed in override method
       - Method marked static/Final cannot be overridden if Final is implemented in super class that means that it is best implementation and no one can override it
       - private cannot be overridein because it it won't be visible out side of class
       - static cannot be overriden because it is accessible only with Class name
       - Overriding JVM decides which method to invoked based on object because untill runtime compiler don't knwo which method to execute because it all depends on object type
        */

class TestOverRidding1 extends TestOverRidding {
    @Override
   void s() {
        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        TestOverRidding test = new TestOverRidding1();// reference variable of superclass but object of child class
        test.s();

    }
}