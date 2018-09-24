package com.code.Array;

import java.util.Arrays;

/**
 * @author prem chand shah on 18-06-2018
 * @project myJava
 */
public class MedianOfTwoSortedArray {
    public static double returnMedian(int[] input1, int[] input2) {
        if (input1.length > input2.length)
            returnMedian(input2, input1);
        int x = input1.length;
        int y = input2.length;

        int high = x;
        int low = 0;
        while (low <= high) {
            int partX = (low + high) / 2;
            int partY = ((x + y + 1) / 2) - partX;
            int maxLeftX = (partX == 0) ? Integer.MIN_VALUE : input1[partX - 1];
            int minRightX = (partX == x) ? Integer.MAX_VALUE : input1[partX];

            int maxLeftY = (partY == 0) ? Integer.MIN_VALUE : input2[partY - 1];
            int minRightY = (partY == y) ? Integer.MAX_VALUE : input2[partY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY)
                high = partX - 1;
            else {
                low = partX + 1;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int input1[] = {15,17,18,21,24,28};
        //Arrays.sort(input1);
        int input2[] = {48,58,68,78,88,99};
//        Arrays.sort(input2);
        System.out.print(returnMedian(input1, input2));
    }
}
