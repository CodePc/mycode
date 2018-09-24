package com.code.Reflection;

/**
 * Created by prem on 4/27/2017.
 */
public class InstanceOf {

    public static void main(String[] args)
    {
        Integer i = new Integer(5);

        InstanceOf instanceOf = new InstanceOf();
        // prints true as i is instance of class
        // Integer
        System.out.println(i instanceof Integer);

        System.out.println( i instanceof Object);

    }
}
