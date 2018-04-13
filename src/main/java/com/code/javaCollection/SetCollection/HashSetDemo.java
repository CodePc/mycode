package com.code.javaCollection.SetCollection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by prem on 4/25/2017.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();

        // adding into HashSetDemo
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// adding duplicate elements

        // printing HashSetDemo
        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("India"));

        // Removing an item
        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }


}
