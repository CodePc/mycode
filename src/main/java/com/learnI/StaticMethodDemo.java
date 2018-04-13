package com.learnI;

import com.learnII.StaticMethods;

/**
 * Created by Prem Chand on 9/22/2016.
 */
public class StaticMethodDemo {
    public static void main(String[] args) {
        StaticMethods staticMethods = new StaticMethods("prem",24);
        staticMethods.staticMethod(); // this will work with instance as well but will give warning message
        StaticMethods.staticMethod(); // working fine with class name directly
        staticMethods.nonStatic(); // using non static with instance/object
        // static method and variable are memeber of class
        // non-static member and variable are member of object of class
        // Static method can be change using any instance but it will reflect to all the instance of that class
        // because static is member of classfile not instance

    }
}
