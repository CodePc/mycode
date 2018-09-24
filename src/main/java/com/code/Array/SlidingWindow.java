package com.code.Array;

/**
 * @author prem chand shah on 04-09-2018
 * @project myJava
 */

import java.util.Deque;
import java.util.LinkedList;

/**
 * Sliding Window Maximum (Maximum of all subarrays of size k)
 * Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
 */
public class SlidingWindow {

    public void maximum(int[] arr, int n, int k) {
        Deque<Integer> deque = new LinkedList();
        // add 1st k range in deque and find max
        // remove peek(1st element if is smaller then other in range)

        for (int i = 0; i < k; i++) {
            if (!deque.isEmpty() && arr[i] > deque.peekLast()) {
                deque.removeLast();
            }
            deque.add(arr[i]);
        }
    }

    /**
     * From Ideserve  > Maximum average subarray of size k
     */

    public static int maxSumSubArrayofSize(int k, int[] arr, int n) {
        if (k > n) {
            throw new IllegalArgumentException("Incorrect array");
        }

        if (k == n)
            return 0;

        int sum = arr[0];

        for (int i = 1; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        int maxSumIndex = 0;
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i - k;
            }
        }
        return maxSum;
    }

    /**
     * Use concept of SLIDING WINDOW
     */
    public int smallestSubArrayWithSum(int k, int[] arr, int n) {
        int minLen = n + 1;
        int sum = 0;

        int start = 0;
        int end = 0;

        while (n < end) {
            if (sum < k && n < end) {
//                sum = sum+ arr[]
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 2, 13, -1, 10, 17};
        System.out.println(maxSumSubArrayofSize(3, arr, arr.length));
    }
}
