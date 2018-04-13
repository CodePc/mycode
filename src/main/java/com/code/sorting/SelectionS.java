package com.code.sorting;

/**
 * Created by prem on 4/21/2017.
 */
public class SelectionS {
    public int[] selectionSort(int[] array, int len) {
        int temp;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            // we select 1st element as min element and compare to whole array and find smallest and put it at 1st
            // and in next pass we start from 2nd position as 1st has already smallest so j= i+1
            for (int j = i + 1; j < len; j++) {
                if (array[j] > array[min]) {
                    min = j;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        SelectionS selectionS = new SelectionS();
        int[] array = {32, 33, 12, 54, 23, 43, 34, 54, 11, 4, 35};
        int[] result = selectionS.selectionSort(array, array.length);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
