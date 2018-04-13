package com.code.Reflection;

/**
 * Created by prem on 4/27/2017.
 *
 * new operator vs newInstance() method in Java
 In general, new operator is used to create objects, but if we want to decide type of object to be created at runtime,
 there is no way we can use new operator. In this case, we have to use newInstance() method. Consider an example:
 */
public class NewInstance {

    int a;
}

class B {
    int b;
}


class run {
    // This method creates an instance of class whose name is
    // passed as a string 'c'.
    public static void fun(String c, String d) throws InstantiationException,
            IllegalAccessException, ClassNotFoundException {
        // Create an object of type 'c'
        Object obj = Class.forName(d).newInstance();
        Object obj2 = Class.forName(c).newInstance();

        // This is to print type of object created
        System.out.println("Object created for class:"
                + obj.getClass().getName());

        obj2.getClass().getName();
    }

    // Driver code that calls main()
    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException, ClassNotFoundException {
        fun("A","C");
    }
}
