package com.learnI;

/**
 * Created by Prem Chand on 9/21/2016.
 */
public class MultipleClassExtendTest {
    public void classOne() {
        System.out.println("MultipleClassExtendTest");
        String s= "Java";
    }
    String s= "with In class";
}

class ClassTestTwo extends MultipleClassExtendTest {
    public void classTwo() {
        System.out.println("class two");
    }

}

class ClassTestThree extends ClassTestTwo { // we can use all the method and variable of extended class and of class extended by them too
    public void classThree() {
        System.out.println("classTestThree");
    }

    public static void main(String[] args) {
    ClassTestThree classTestThree = new ClassTestThree();
        classTestThree.classOne();
        classTestThree.classTwo();
        classTestThree.classThree();
        System.out.println(classTestThree.s);
    }
}