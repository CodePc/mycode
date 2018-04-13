package com.learnI;

/**
 * Created by prem on 4/13/2017.
 */
public class SuperKeywordDemo {
    public SuperKeywordDemo(int i) {
        int j = i;
        System.out.println("first const");
        System.out.println(j);
    }

    public SuperKeywordDemo() { // this is not invoked because this() is not used , this invokes default constructor of object

    }

    public static void main(String[] args) {
        SuperKeywordDemo superKeywordDemo = new SuperKeywordDemo(21);
    }
}
