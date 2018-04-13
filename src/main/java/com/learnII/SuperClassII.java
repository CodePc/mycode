package com.learnII;

/**
 * Created by SuperClassII Chand on 8/28/2016.
 */

/*use of super class*
 */
public class SuperClassII extends SuperClassI {
    int s = 40;

    void displaySub() {
        System.out.println(s); /* instance variable of current class */
    }

    void displaySuper() {
        System.out.println(super.s); /*as there are same vaiable user in super and sub class it will take
                                                            instance variable of super class  */
    }

    public static void main(String[] args) {
        SuperClassII p = new SuperClassII();
        p.displaySub();
        p.displaySuper();
    }
}
