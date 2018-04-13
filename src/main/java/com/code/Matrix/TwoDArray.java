package com.code.Matrix;

/**
 * Created by prem on 5/8/2017.
 */
public class TwoDArray {
    public static void matrixMethod(int[][] array) {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (i == 0 || j == 0 || i == 4 || j == 4) {
                    array[i][j] = 1;
                } else
                    array[i][j] = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("    ");
        }
    }

    public static void main(String[] args) {
        int[][] marks = new int[2][3];
        int[][] people = new int[3][]; // this can have any number of child
        people[0] = new int[22];
        people[1] = new int[23];
        people[2] = new int[24];
//        people[4] = new int[35]; // this is not allowed as it is out of bound
        matrixMethod(new int[5][5]);
    }
}
