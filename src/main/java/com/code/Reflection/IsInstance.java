package com.code.Reflection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prem on 4/27/2017.
 * <p>
 * Instanceof operator vs isInstance() method in Java
 * instanceof operator and isInstance() method both are used for checking the class of the object.
 * But main difference comes when we want to check the class of object dynamically. In this case isInstance() method
 * <p>
 * will work. There is no way we can do this by instanceof operator.
 * <p>
 * instanceof operator and isInstance() method both return a boolean value. Consider an example:
 */
public class IsInstance {
    // This method tells us whether the object is an
    // instance of class whose name is passed as a
    // string 'c'.


    public static boolean fun(Object obj, String c) throws ClassNotFoundException {
        List<String> list = new ArrayList<>();
        System.out.println(Class.forName(c).isInstance(list));
        return Class.forName(c).isInstance(obj);

    }

    // Driver code that calls fun()
    public static void main(String[] args) throws ClassNotFoundException {
        Integer i = new Integer(5);

        // print true as i is instance of class
        // Integer
        boolean b = fun(i, "java.lang.Integer");

        // print false as i is not instance of class
        // String
        boolean b1 = fun(i, "java.lang.String");

        /* print true as i is also instance of class
           Number as Integer class extends Number
           class*/
        boolean b2 = fun(i, "java.lang.Number");

        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
    }
}
