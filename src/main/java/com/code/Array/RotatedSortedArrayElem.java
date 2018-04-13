package com.code.Array;

/**
 * Created by prem on 5/7/2017.
 */
public class RotatedSortedArrayElem {
    private static int elementInRotatedSortedElement(int[] array, int size, int k) {
        if (array == null || size == 0)
            return -1;
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + (high - low)) / 2;
            if (mid == k)
                return k;
            if (array[low] <= array[mid]) {
                if (array[low] <= k && k <= array[mid]) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            } else if (array[mid] < array[high]) {
                if (array[mid] <= k && k <= array[high]) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
        }
        return 1;
    }

    static void printRepeating(int arr[], int size) {
        int[] count = {0};
        int i;

        System.out.println(" Repeating elements are ");
        for (i = 0; i < size; i++) {
            if (count[arr[i]] == 1)
                System.out.println(arr[i]);
            else
                count[arr[i]]++;
        }
    }


    public static void main(String[] args) {
        int[] array = {8, 4, 6, 7, 5, 12, 10, 15};
        int size = array.length;
        //System.out.println(elementInRotatedSortedElement(array, size, 10));
        printRepeating(array,array.length);
    }
}
