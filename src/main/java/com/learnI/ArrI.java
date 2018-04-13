package com.learnI;

/*importing class from different package we to import with full path and than we can use all the public
method of that class
*/

import com.learnII.ArrII;

/**
 * Created by SuperClassII Chand on 8/23/2016.
 */
public class ArrI {
    int sum(int arr[]) {
        int sum = 0;
        for (int arrs : arr) {
            sum = sum + arrs;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrI a = new ArrI();
        int[] ar = {2, 3, 4};
        int sum;
        sum = a.sum(ar);
        System.out.println("sum is: " + sum);
        ArrII another = new ArrII();
        int mui = another.multi(ar);
        System.out.println("multiplication is" + ": " + mui);
        another.arrayCreation();
        another.returningRevArray(ar);
        another.passingArray(ar);
        another.arrayLength(ar);
        another.arrayLengthNoFun(ar);
    }
}
