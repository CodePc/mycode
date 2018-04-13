package com.learnII;

/**
 * Created by Prem Chand on 9/22/2016.
 */
public class StaticMethods {
    public static String name;
    public static int age;
    public StaticMethods(String name,int age){ // there constructor is of public type because it is getting initialized  outside class/package
        this.name=name;
        this.age=age;
    }
    public static void staticMethod(){
        System.out.println("static method belong to class only not to instance/object" +
        "so that we can directly call static method like className.staticMethodName");
    }
    public void nonStatic(){
        System.out.println("non-static method don't belong to class it below to instance/object" +
                "so we have to call it via object");
    }

    public static void main(String[] args) {
        StaticMethods staticMethods = new StaticMethods("prem",24);
        staticMethods.staticMethod(); // this will work with instance as well but will give warning message
        StaticMethods.staticMethod(); // working fine with class name directly
        staticMethods.nonStatic(); // using non static with instance/object
        System.out.println("age" +
                age+"name"+name);
    }
}
