package com.code.sorting;

/**
 * Created by prem on 4/21/2017.
 */
public class InsertionS {
    public int[] insertionSort(int[] array, int len) {
        int temp = 0;
        for (int i = 0; i < len-1; i++) {
            // in 1st pass largest elm will be at last to no need to compare with last elm so decrease a size by i pass
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] < array[j + 1]) {// we are comparing adjacent elements and pushing largest element at end
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        InsertionS insertionS = new InsertionS();
        int[] array = {32, 33, 12, 54, 23, 43, 34, 54, 11, 4,35};
        int[] result = insertionS.insertionSort(array, array.length);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
