package com.learnI;

import java.util.Arrays;

/**
 * Created by Prem Chand on 9/21/2016.
 */
public class Enum {

    public enum Season {
        WINTER("prem"), SPRING("prem"), SUMMER("prem"), FALL("prem");
        String value;
        Season(String value){
        this.value=value;
    }
    }


    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s);
        System.out.println(Arrays.toString(Season.values()));

    }
}
