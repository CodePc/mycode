package com.code.Array;

/**
 * @author prem chand shah on 07-05-2018
 * @project myJava
 */


import java.util.Arrays;

/**
 * This is a demo task.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 1,1,2,3,4,6
 */


public class SmallestNotInArray {
    public int solution(int[] A) {
        int smallest = 0;
        Arrays.sort(A);
        for (int j = 0; j < A.length; j++) {
            if (A[j]!=A[j]+1 && A[j]>0)
                return A[j]+1;
        }
        return 0;
    }


    public static void main(String[] args) {


    }
}