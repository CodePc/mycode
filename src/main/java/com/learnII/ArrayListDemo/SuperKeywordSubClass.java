package com.learnII.ArrayListDemo;

import com.learnI.SuperKeywordDemo;

/**
 * Created by prem on 4/13/2017.
 */
public class SuperKeywordSubClass extends SuperKeywordDemo {
    public SuperKeywordSubClass() {
        super(2); // invoke the super class constructor if super constructor don't have any argument we don't need use super
    }

    public static void main(String[] args) {
        SuperKeywordSubClass superKeywordSubClass = new SuperKeywordSubClass();
    }
}
