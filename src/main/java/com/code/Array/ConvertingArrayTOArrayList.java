package com.code.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prem on 4/24/2017.
 */
public class ConvertingArrayTOArrayList {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Object[] objects = al.toArray();

        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
    }
}
