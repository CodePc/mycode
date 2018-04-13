package com.code;

/**
 * Created by prem on 4/19/2017.
 */
public class SmallestMissingNumber {

    int findFirstMissing(int array[], int start, int end) {
        if (start > end)
            return end + 1;

        if (start != array[start])
            return start;

        int mid = (start + end) / 2;

        // Left half has all elements from 0 to mid
        if (array[mid] == mid)
            return findFirstMissing(array, mid + 1, end);

        return findFirstMissing(array, start, mid);
    }

    int findFirstMissingNumberTwo(int array[], int start, int end) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            if (array[i] != 0) {
                return 0;
            }
            if (array[i] != array[i] + 1) {
//                return array[i] + 1;
                System.out.println(array[i]+1);
                break;
            }
        }
        return -1;
    }

    // Driver program to test the above function

    public static void main(String[] args) {
        SmallestMissingNumber small = new SmallestMissingNumber();
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        int n = arr.length;

//        small.findFirstMissingNumberTwo(arr, 0, n - 1);
//        System.out.println("First Missing element is : "
//                + small.findFirstMissing(arr, 0, n - 1));
        System.out.println(small.findFirstMissingNumberTwo(arr,0,n-1));
    }
}
