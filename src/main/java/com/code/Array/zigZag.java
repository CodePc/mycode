package com.code.Array;

/**
 * @author prem chand shah on 29-05-2018
 * @project myJava
 */
public class zigZag {

    static int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};

    // Method for zig-zag conversion of array
    static void zigZag() {
        // Flag true indicates relation "<" is expected,
        // else ">" is expected.  The first expected relation
        // is "<"
        boolean flag = true;

        int temp = 0;

        for (int i = 0; i <= arr.length - 2; i++) {
            if (flag)  /* "<" relation expected */ {
                /* If we have a situation like A > B > C,
                   we get A > B < C by swapping B and C */
                if (arr[i] > arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            } else /* ">" relation expected */ {
                /* If we have a situation like A < B < C,
                   we get A < C > B by swapping B and C */
                if (arr[i] < arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag; /* flip flag */
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        zigZag.zigZag();
    }

    @Override
    public String toString() {
        return "zigZag{}";
    }
}
