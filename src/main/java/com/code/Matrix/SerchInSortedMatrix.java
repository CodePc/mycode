package com.code.Matrix;

/**
 * @author prem chand shah on 08-07-2018
 * @project myJava
 */
public class SerchInSortedMatrix {

    public static boolean search(int[][] mat, int n, int x) {
        int i = 0;
        int j = n - 1;

        while (i < n && j >= 0) {
            if (mat[i][j] == x)
                return true;
            else if (mat[i][j] > x)
                j--;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int mat[][] =
                {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        System.out.println(search(mat, 4, 50));
    }
}
