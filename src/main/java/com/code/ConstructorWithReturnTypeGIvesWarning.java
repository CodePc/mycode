package com.code;

/**
 * Created by prem on 4/25/2017.
 */
public class ConstructorWithReturnTypeGIvesWarning {
    int ConstructorWithReturnTypeGIvesWarning() { // this method will not invoke with out object, because it has return type
        System.out.println("Printing from constructor Like method");
        return 1;
    }

    public static void main(String[] args) {
        ConstructorWithReturnTypeGIvesWarning constructorWithReturnTypeGIvesWarning = new ConstructorWithReturnTypeGIvesWarning();
       // System.out.println(constructorWithReturnTypeGIvesWarning.ConstructorWithReturnTypeGIvesWarning());
    }
}
