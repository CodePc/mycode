package com.code.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by prem on 4/24/2017.
 */


/*
* There are often times when we need to do following tasks on an array in Java.

Fill an array with a particular value. We usually do it with the help of a for loop.
Sort an array.
Binary search in sorted array.
And many more..

-- This class is a member of the Java Collections Framework and is present in java.util.arrays.

*/
public class ArraysClassTest {
    public static void main(String[] args) {
        int[] array = {2, 32, 43, 34, 1, 21, 32, 42, 43};
        String str = Arrays.toString(array);
        System.out.println("Array to String" + str);
        System.out.println("Sorted Array" + Arrays.toString(array));
        Arrays.sort(array, 0, 4);
        System.out.println("sorted form 0 to 4 " + Arrays.toString(array));
        int status = Arrays.binarySearch(array, 21);
        System.out.println("Binary Search : If found status will be 1" + status);
        status = Arrays.binarySearch(array, 3232);
        System.out.println("Binary Search : If Not found status will be -1" + status);
        int[] copy1 = Arrays.copyOf(array, 2);
        System.out.println("Copy from 0 to 2" + Arrays.toString(copy1));
        int[] temp = Arrays.copyOfRange(array, 2, array.length);
        System.out.println("copy of array " + temp);
        Arrays.fill(array, 1);
        System.out.println("filled all the array with 1" + Arrays.toString(array));
        Arrays.fill(array, 3, array.length, 1);
        System.out.println("replace array from 0 to end of arraay with 1" + Arrays.toString(array));
        Integer[] tempArray = {21, 21, 32, 3243, 43, 43, 43};
        System.out.println("Print list " + Arrays.asList(tempArray));
        List<Integer> l = new ArrayList<>();
        l = Arrays.asList(tempArray);
        System.out.println("Last element of list" + l.get(tempArray.length - 1));
        Integer[] a = {21, 21, 21};
    }

}
