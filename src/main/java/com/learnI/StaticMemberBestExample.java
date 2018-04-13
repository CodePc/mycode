package com.learnI;

/**
 * Created by prem on 4/16/2017.
 */
public class StaticMemberBestExample {
    static int a = 30; // static variable, belongs to class (.class file) not any object
    static int roll = 100;

    public void print() {
        System.out.println(a);
    }

    public static void getRollNo(int roll) {
    }


    public static void main(String[] args) {
        StaticMemberBestExample s = new StaticMemberBestExample(); // creating new object to class StaticMemberBestExample
        System.out.println(s.a); // currently it value is 30
        s.a = 100;  // VVI : using instance s we are changing the value of a, so it will reflect to all the instance(object) of that class
        // because it changed in .class file as static is part of class not object so now if we create any object value of a will remain 100
        StaticMemberBestExample b = new StaticMemberBestExample(); // creating new instance of class,
        System.out.println(s.a + " " + b.a); // out for both will be 100 because we have change the class member not a object member, so now creating any number of
        // object of that class will give same value for a
        System.out.println(StaticMemberBestExample.a);
        b.a = 200;
        s.print();
        b.print();
        System.out.println(s.a); // here value will be 200 because last change was done by  instance b so it will reflect in all the instance
        getRollNo(200); // we can access static method directly with name in class, we don't need any instance because static method/variable belongs to clas
    }
}
