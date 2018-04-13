package com.learnII;

/**
 * Created by SuperClassII Chand on 8/23/2016.
 */
public class ArrII {
    public int multi(int arr[]) {
        int m = 1;
        for (int arrs : arr) {
            m = m * arrs;
        }
        return m;
    }

    public void arrayCreation() {
        int[] a = {1, 2, 3};
        int[] refArray = new int[20];// creating an array and instancing
        int size = refArray.length;
        System.out.println("size :" + size);
    }

    public void passingArray(int[] array) {
        System.out.println("list of array");
        for (int arrays : array) {
            System.out.println(arrays + "\n");
        }
    }

    public int[] returningRevArray(int[] array) {
        int[] extraArray = new int[array.length];
        for (int i = 0, j = extraArray.length - 1; i < array.length; i++, j--) {
            extraArray[j] = array[i];
        }
        return extraArray;
    }

    public void useOfSuperClass() {
        int speed = 50;
    }

    public void arrayLength(int [] arr){
        System.out.println("array length: "+arr.length);
    }
    public void arrayLengthNoFun(int [] arr){
        int i;
        for( i=0 ;i<arr.length;i++){
            System.out.println("Index "+ i +": " +arr[i]);
        }
    }
}
