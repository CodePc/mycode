package com.code.javaCollection.SetCollection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by prem on 5/3/2017.
 */
public class DuplicateArrayElmAtK {
    static boolean checkDuplicatesWithinK(int arr[], int k) {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array
        for (int i = 0; i < arr.length; i++) {
            // If already present n hash, then we found
            // a duplicate within k distance
            if (set.contains(arr[i]))
                return true;


            // Add this item to hashset
            set.add(arr[i]);

            // Remove the k+1 distant item
            if (i >= k)
                set.remove(arr[i - k]);
        }
        return false;
    }

    public void elementInArray() {
        int []  i ={2,3,4,5,};
        Arrays.toString(i).contains("5");

    }

    // Driver method to test above method
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        if (checkDuplicatesWithinK(arr, 3))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
