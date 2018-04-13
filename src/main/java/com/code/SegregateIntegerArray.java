package com.code;

/**
 * Created by prem on 4/13/2017.
 */
public class SegregateIntegerArray {
    public int[] segregateReplaceMethod(int[] a) { // time : O(n) space O(n)
        int len = a.length;
        System.out.println("All array element");
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
        int zero = 0;
        int one = len - 1;
        int[] b = new int[len];
        for (int j = 0; j < a.length; j++) {
            if (a[j] == 0)
                b[zero++] = 0;
            else
                b[one--] = 1;
        }
        System.out.println("\n");
        System.out.println("Array after sort");
        for (int i = 0; i < len; i++) {
            System.out.println(b[i]);
        }
        return b;
    }

    public void segregateCountMethod(int[] a) { // time : O(n) space: O(1)
        int len = a.length;
        int zeroCount = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] == 0)
                zeroCount++;
        }
        for (int j = 0; j < len; j++)
            if (zeroCount != 0) {
                System.out.println(0);
                zeroCount--;
            } else System.out.println(1);

    }

    public void sortMethod(int[] a) { // selection sort O(n)
        int len = a.length;
        int temp = 0;
        int min = 0;
        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[i]) {
                    min = j;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 1, 0, 1, 0, 1, 0};
        int len = input.length;
        SegregateIntegerArray segregateIntegerArray = new SegregateIntegerArray();
        int[] result = segregateIntegerArray.segregateReplaceMethod(input);
        System.out.println("Sorted array in Main Method");
        for (int i = 0; i < len; i++) {
            System.out.println(result[i]);
        }
        System.out.println("Count Method");
        segregateIntegerArray.segregateCountMethod(input);

        System.out.println("Sort Method");
        segregateIntegerArray.sortMethod(input);
    }
}
