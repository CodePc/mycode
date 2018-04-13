package com.code.sorting;

/**
 * Created by prem on 4/13/2017.
 */
public class Sorting {
    public void selectionSort(int[] a) {
        int len = a.length;
        int temp = 0;
        int min = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Selection sort");
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
    }

    public void bubbleSort(int[] a) {
        int len = a.length;
        int temp = 0;
        int min = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println("bubble sort");
        for (int k = 0; k < len; k++) {
            System.out.println(a[k]);
        }
    }


    public static void main(String[] args) {
        int[] input = {2, 3, 32, 31, 43, 45, 22, 1};
        Sorting sorting = new Sorting();
        sorting.selectionSort(input);
        sorting.bubbleSort(input);
    }
}
