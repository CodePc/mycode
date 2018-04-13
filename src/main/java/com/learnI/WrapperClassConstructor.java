package com.learnI;

/**
 * Created by prem on 4/16/2017.
 */
public class WrapperClassConstructor {
    public void withNewKeyword() { // every wrapper class has two constructor type (string & primitive data type of class)
        Integer a = new Integer(30); // primitive data int
        Integer b = new Integer("40"); // Sting
        Integer i = new Integer(50); // this object is un used is like assigning new value to obj
        i = new Integer(45); // here i is referring to new object
        System.out.println(i);

    }

    public void withValueOf() {
        Integer a = Integer.valueOf(300); // this will more preferable because it directly return object, using new will take a space on heap
        Integer b = Integer.valueOf("400");
        a.compareTo(Integer.valueOf("200")); // a is object of Integer wrapper class, so we are able to use . method name
        int c = 300; // this not object, its primitive data type
        System.out.println(a);
        String p = a.toString();
        System.out.println(p);
        a = 600; // this will not change the value of a to 600 because wrapper class is immutable, value will not be change once assigned
        System.out.println(a);
    }

    public static void main(String[] args) {
        WrapperClassConstructor wrapperClassConstructor = new WrapperClassConstructor();
        wrapperClassConstructor.withValueOf();
    //    wrapperClassConstructor.withNewKeyword();
    }
}
