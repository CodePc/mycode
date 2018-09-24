package com.code.Array;

/**
 * @author prem chand shah on 30-05-2018
 * @project myJava
 */
public class SecondLargestElement {
    public static int secondLargest(int[] arr) {
        int first = arr[0];
        int second = arr[1];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (first < arr[i]) {
                second = first;
                first = arr[i];

            }
        }
        return second;
    }


    public static int secondLargestCode(int[] arr) {
        int size = arr.length;
        int max = 0, prevMax = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                prevMax = max;
                max = arr[i];
            } else if (prevMax < arr[i]) {
                prevMax = arr[i];
            }
        }
        return prevMax;
    }

    public static void swap(int n1, int n2) {
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;

    }

    public static void solution(int arr[]) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            while (arr[l] == 0 && l < r) {
                l++;
            }
            while (arr[r] != 0 && l < r) {
                r--;
            }

            if (l < r) {
                int tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
                l++;
                r--;
            }
        }
    }


    public static void main(String[] args) {

//        int[] arr = {11, 51, 88, 6, 7, 81, 99};
        int[] nonZero = {6, -1, 5, 4, -9, 0, 0,0,0};
          solution(nonZero);

        for (int ele : nonZero)
            System.out.println(" " + ele);
    }
}
