package com.code.Generics;

/**
 * Created by prem on 4/30/2017.
 */
public class GenricsAtMethodLevel {
    public <T1, T2> void genericMethod(Juice juice, Water water) {
        System.out.println("First genric method");
    }

    public static void main(String[] args) {
        Juice j = new Juice();
        Water w = new Water();
        GenricsAtMethodLevel genricsAtMethodLevel = new GenricsAtMethodLevel();
        genricsAtMethodLevel.<Juice, Water>genericMethod(j, w);
    }
}
