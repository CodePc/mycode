package com.code.String;

import static com.code.String.ReverseWithoutEffectingSpecialChar.swap;

/**
 * @author prem chand shah on 29-06-2018
 * @project myJava
 */
public class PermutationOfString {

    public static void permute(String s, int l, int r) {
        if (l == r)
            System.out.println(s);
        else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r);
                s = swapAndReutnString(s, l, i); // backtrack, we are restoring original position of character
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, str.length() - 1);
    }

    public static String swapAndReutnString(String str, int l, int r) {
        char[] tempArray = str.toCharArray();
        char temp = tempArray[l];
        tempArray[l] = tempArray[r];
        tempArray[r] = temp;
        return String.valueOf(tempArray);
    }
}
