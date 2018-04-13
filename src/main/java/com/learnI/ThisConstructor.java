package com.learnI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by prem on 4/13/2017.
 */
public class ThisConstructor {
    int speed;

    ThisConstructor() {
        this.speed = 500;
        System.out.println("invoked by this()");
    }

    ThisConstructor(int speed) {
        this(); // is will always invoke the default constructor of its own class
        this.speed = speed;
    }

    public static void main(String[] args) {
        ThisConstructor thisConstructor = new ThisConstructor(200);
    }
}
