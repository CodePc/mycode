package com.code.Matrix;

import java.util.HashSet;

/**
 * @author prem chand shah on 08-07-2018
 * @project myJava
 */
public class UniqueRows {

    private static void printArray(int[][] arr, int row, int col) {
        HashSet<String> set = new HashSet<String>();

        for(int i = 0; i < row; i++)
        {
            String s = "";

            for(int j = 0; j < col; j++)
                s += String.valueOf(arr[i][j]);

            if(!set.contains(s)) {
                set.add(s);
                System.out.println(s);

            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 1, 1, 0, 0}};

        printArray(arr, 4, 5);
    }
}
