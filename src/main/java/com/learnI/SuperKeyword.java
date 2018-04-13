package com.learnI;

import com.learnII.ChildClass;

/**
 * Created by Prem Chand on 9/21/2016.
 */
public class SuperKeyword extends ChildClass{
    public void method(){
        System.out.println("child");
    }
    public void myMethods(){
        SuperKeyword superKeyword = new SuperKeyword();
        System.out.println("from subclass");
        superKeyword.method();
        System.out.println("this is from superClass");
        super.method();
    }

    public static void main(String[] args) {
        SuperKeyword superKeyword = new SuperKeyword();
        superKeyword.myMethods();
    }
}
