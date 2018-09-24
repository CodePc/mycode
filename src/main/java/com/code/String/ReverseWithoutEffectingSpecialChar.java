package com.code.String;


import java.util.Collection;

/**
 * @author prem chand shah on 16-04-2018
 * @project myJava
 */
public class ReverseWithoutEffectingSpecialChar {

    public static void reverseString(String string) {
        char[] stringChar = string.toCharArray();
        int r = stringChar.length - 1;
        int l = 0;
        while (l < r) {
            if (!isAlph(stringChar[l]))
                l++;
            else if (!isAlph(stringChar[r])) {
                r--;
            } else {
                char temp = stringChar[l];
                stringChar[l] = stringChar[r];
                stringChar[r] = temp;
                l++;
                r--;
            }
        }
        System.out.println("Reversed String");
        System.out.println(stringChar);
    }

    private static void swap(char c, char c1) {
        char t = c;
        c = c1;
        c1 = c;

    }

    static String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }


    static boolean isAlph(char c) {
        return ((c >= 'A' && c <= 'Z') ||
                (c >= 'a' && c <= 'z'));
    }

    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        System.out.println("Original String \n" + str);
        reverseString(str);
    }
}
