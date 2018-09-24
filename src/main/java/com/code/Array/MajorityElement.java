package com.code.Array;

/**
 * Created by prem on 5/7/2017.
 */
public class MajorityElement {
    static int[] count = {0};

    public static int majorityElem(int[] array, int size) {
        Integer candidate = null;
        int count = 0;
        for (int i = 0; i < size - 1; i++) {
            if (count == 0) {
                count++;
                candidate = array[i];
                continue;
            } else if (array[i] == candidate) {
                count++;
            } else count--;
        }
        return candidate;
    }

    public static boolean isMajority(int[] array, int majElem, int len) {
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if (array[i] == majElem)
                count++;
        }
        return (count > array.length / 2) ? true : false;
    }

    public static int[] buildHashTable(int[] array) {
        for (int i = 0, l = array.length; i < l - 1; i++)
            count[array[i]]++;
        return count;
    }

    public static int majorityIfOccNbyThree(int[] array) {
        int[] arr = buildHashTable(array);
        for (int i = 0, l = array.length; i < (l - 1); i++) {
            if (count[arr[i]] == array.length / 3)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] array = {2, 1, 2, 4, 7}; // this case will fail because it gives 7 as majority candidate
        int[] array = {2, 1, 2, 2, 2, 2, 4, 7};
        int majElm = majorityElem(array, array.length);
        System.out.println(" maoj elm " + majElm);
//        System.out.println(isMajority(array, majElm, array.length));
//        System.out.println(majorityIfOccNbyThree(array));
    }
}
