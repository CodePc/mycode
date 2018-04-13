package com.code;

/**
 * Created by prem on 4/17/2017.
 */
public class ReverseArray {
    public void reverseTheArray(int[] arr, int size) {
        int temp = 0;
        int last = size;
        for (int i = 0; i < size / 2; i++) {
            temp = arr[i];
            arr[i] = arr[last - 1];
            arr[last - 1] = temp;
            last--;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {23, 12, 10, 1, 3, 5,16};
        int size = array.length;
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverseTheArray(array, size);
    }
}
