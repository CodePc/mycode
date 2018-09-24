package com.code.String;

/**
 * @author prem chand shah on 20-06-2018
 * @project myJava
 */
public class kAdjacentSwap {

    public int getMax(int input[]) {
        int max = 0;
        for (int i : input) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public void maxPossibleInt(int arr[],int noOfSwaps){
        int max = getMax(arr);

    }
}
