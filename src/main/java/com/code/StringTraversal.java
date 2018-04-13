package com.code;

/**
 * Created by prem on 4/14/2017.
 */
public class StringTraversal {
    public static void getCharByForLoop() {
        String s = new String("kishan");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void getCharByAdvFor() {
        String h = "hello world";
        char[] c = new char[h.toCharArray().length]; // :P wrong
        char [] d = h.toCharArray(); // correct 
        for (char cc : h.toCharArray()) {
            System.out.println(cc);
        }
    }

    public static void main(String[] args) {
        StringTraversal.getCharByForLoop();
        System.out.println("\n");
        StringTraversal.getCharByAdvFor();
    }
}
