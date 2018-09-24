package com.code.Array;


/**
 * @author prem chand shah on 24-05-2018
 * @project myJava
 */
public class MaxSumSubArray {
    public static int findMaxSumSubArray(int arr[]) {
        int sum = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + sum > 0) {
                sum += arr[i];
            } else
                sum = 0;
            max = Integer.max(sum, max);
        }
        return max;
    }


    /**
     * This is DP approach this will handle the corner case where all the element is negative integer
     */

    //Kadane algo
    public static int maxSubArraySum(int a[], int size) {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++) {
            curr_max = Integer.max(a[i], curr_max + a[i]);
            max_so_far = Integer.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(MaxSumSubArray.findMaxSumSubArray(arr));
    }


    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
