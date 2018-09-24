package com.code.InterviewQuestion;

/**
 * @author prem chand shah on 20-04-2018
 * @project myJava
 */
public class PutAllZeroAtStart {

    public static void replace(int arr[]) {
        int i = 0, j = arr.length - 1;

        int b = 0;

        while (j > i) {
            if (arr[i] == b) {
                i++;
                continue;
            }
            while (j != b) {
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = arr[i];
        }

        for (int jj : arr) {
            System.out.println(jj);
        }
    }



    public static void main(String[] args) {
        int arr[] = {0, 0, -5, 8, 9, 0, 0, 10};
        PutAllZeroAtStart.replace(arr);
    }
}
