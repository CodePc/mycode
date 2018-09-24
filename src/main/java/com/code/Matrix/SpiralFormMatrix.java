package com.code.Matrix;

/**
 * @author prem chand shah on 08-07-2018
 * @project myJava
 */

/**
 * Complexity O(nm)
 */
public class SpiralFormMatrix {

    public static void spiral(int[][] mat, int m, int n) {
        int sc = 0, ec = n, sr = 0, er = m, i;
        while (sc < ec && sr < er) {

            for (i = sc; i < ec; ++i) {
                System.out.print(mat[sr][i] + " ");
            }
            sr++;

            for (i = sr; i < er; i++) {
                System.out.print(mat[i][ec - 1] + " ");
            }
            ec--;
            if (sr < er) {
                for (i = ec - 1; i >= sc; --i) {
                    System.out.print(mat[er - 1][i] + " ");
                }
                er--;
            }
            if (sc < ec) {
                for (i = er - 1; i >= sr; --i) {
                    System.out.print(mat[i][sc] + " ");
                }
                sc++;
            }
        }

    }

    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {99, 58, 39, 19, 23, 45},
                {13, 14, 15, 16, 17, 18}};

        spiral(a, 4, 6);
    }
}
