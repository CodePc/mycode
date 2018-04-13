package com.code;

public class StringUses {
    public static void main(String[] args) {


        // String myString = new String("Hello World");
        String myString1 = new String("Hello World");
        String myString2 = new String("Hello World");

        String[] strings = new String[]{"one", "two", "three", "four", "five"};

        String result = null;
        for (String string : strings) {
            System.out.println(result = result + string);
        }
        System.out.println("Length of string is " + strings.length);
    }
}
