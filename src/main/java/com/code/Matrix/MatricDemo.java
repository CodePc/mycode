package com.code.Matrix;

/**
 * @author prem chand shah on 26-06-2018
 * @project myJava
 */
public class MatricDemo {
    static int[][] matrix = new int[5][4];

    public static void matrix() {
        int ii = 0;
//        System.out.println(matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ii;
            }
        }
    }

    public static void printMatrix() {
//        System.out.println(matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        matrix();
        printMatrix();
    }
}

