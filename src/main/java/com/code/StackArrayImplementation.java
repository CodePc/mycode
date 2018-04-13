package com.code;

/**
 * Created by prem on 4/18/2017.
 */
public class StackArrayImplementation {
    int bE = 20;
    int top = -1;
    int base = -1;

    public void AddElmToStack(int[] array, int len) {

        if (top == len - 1) {
            System.out.println("Stack overflow");
            return;
        }
//        for (int i = 0; i < len; i++) {
            if (top == -1 && base == -1) {
                top++;
            }
            array[top++] = bE++;
//        }
        System.out.println("Stack after addition of element");
        for (int i = 0; i < top-1; i++) {
            System.out.println(array[top]);
        }
    }

    public void removeElmToStack(int[] array, int len) {
        if (top == -1) {
            System.out.println("Stack underFlow: no element to remove");
        }
        System.out.println("removed element is " + array[top]);
        top--;
//        System.out.println("Stack after removing of element");
//        for (int i = 0; i < len; i++) {
//            System.out.println(array[i]);
//        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        int size = array.length;
        StackArrayImplementation stackArrayImplementation = new StackArrayImplementation();
        stackArrayImplementation.AddElmToStack(array, size);
//        stackArrayImplementation.removeElmToStack(array,size);
//        stackArrayImplementation.removeElmToStack(array,size);

    }
}
