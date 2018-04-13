package com.learnII;

import com.learnI.SupClass;

/**
 * Created by Prem Chand on 9/21/2016.
 */
public class ChildClass extends SupClass {
    @Override
    public void method(){
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        SupClass supClass = new ChildClass();
        supClass.method();

    }
}
