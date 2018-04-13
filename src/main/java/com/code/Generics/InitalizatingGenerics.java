package com.code.Generics;

/**
 * Created by prem on 4/30/2017.
 */
public class InitalizatingGenerics {
    public static void main(String[] args) {
        Glass<Water> waterGlass = new Glass<>(); // here, Glass class is of type Water
        Glass<Juice> juiceGlass = new Glass<>(); // here, Glass class is of  JuiceType
        // juice is type argument to type parameter defined for Glass class that is generic
        new Glass<>(); // not mentoining type arguemnt on instance part is call "Type inferences"

    }
}
