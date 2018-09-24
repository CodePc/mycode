package com.code.Trees;

/**
 * @author prem chand shah on 18-06-2018
 * @project myJava
 */


// Range query
public class SegmentTree {

    int segmentArray[];

    // O(n)- time complexity
    public void constructSegmentArray(int inputArray[], int segmentArr[], int low, int high, int position) {
        if (high == low) {
            segmentArr[position] = inputArray[low];
        }
        int mid = (low + high) / 2;
        constructSegmentArray(inputArray, segmentArr, low, mid, 2 * position + 1);
        constructSegmentArray(inputArray, segmentArr, mid + 1, high, 2 * position + 2);
        segmentArr[position] = Math.min(segmentArr[2 * position + 1], segmentArr[2 * position + 2]);
    }

//    static int rangeMinQuery(int[] segmentArray, int qLow, int qHigh, int high, int low, int pos){
//
//    }
}
