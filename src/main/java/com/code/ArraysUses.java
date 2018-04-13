package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysUses {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("prem");
        System.out.println(strings.size());

        List<String> s1 = new ArrayList<>();

        int[] i = new int[10];

        int[] ints = {0, 22, 45, 16, 7, 10};

        System.out.println(ints[3]);
        for (int a : ints) {
            System.out.println(a);
        }

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.asList(ints).size());
        System.out.println(Arrays.binarySearch(ints, 2));
        System.out.println(ints.length);
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }

}
