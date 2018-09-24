package com.code;

/**
 * @author prem chand shah on 21-05-2018
 * @project myJava
 */
public class StaticSatish {
     int x;

    public int inc() {
        return x++;
    }

    public static void main(String[] args) {
        StaticSatish staticSatish = new StaticSatish();
        System.out.println(staticSatish.inc());
        System.out.println(staticSatish.inc());
        System.out.println(staticSatish.inc());
        System.out.println(staticSatish.inc());
    }
}
