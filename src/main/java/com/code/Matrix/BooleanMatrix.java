package com.code.Matrix;

/**
 * @author prem chand shah on 08-07-2018
 * @project myJava
 */
public class BooleanMatrix {

    private static void modifyMatrix(int[][] mat, int R, int C) {
        int row[] = new int[R];
        int col[] = new int[C];

        for (int i = 0; i < R; i++) {
            row[i] = 0;
        }
        for (int j = 0; j < C; j++) {
            col[j] = 0;
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }


        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }

    }

    private static void printMatrix(int[][] mat, int R, int C) {
        int i, j;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
                {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0},};

        System.out.println("Matrix Intially");

        printMatrix(mat, 3, 4);

        modifyMatrix(mat, 3, 4);

        System.out.println("Matrix after modification n");
        printMatrix(mat, 3, 4);

    }

}
