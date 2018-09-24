package com.code.String;

/**
 * Created by prem on 5/17/2017.
 */
public class LongestPalindromicSubstring {
    public static String LPS(String s) {
        int n = s.length();
        int palindromeBeginsAt = 0; //index where the longest palindrome begins
        int max_len = 1;//length of the longest palindrome
//        boolean palindrome[][] = new boolean[n][n]; //boolean table to store palindrome truth
        boolean[][] palindrome = new boolean[n][n];
        //Trivial case: single letter palindromes
        for (int i = 0; i < n; i++) {
            palindrome[i][i] = true;
        }

        //Finding palindromes of two characters.
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                palindrome[i][i + 1] = true;
                palindromeBeginsAt = i;
                max_len = 2;
            }
        }

        //Finding palindromes of length 3 to n and saving the longest
        for (int curr_len = 3; curr_len <= n; curr_len++) {
            for (int i = 0; i < n - curr_len + 1; i++) {
                int j = i + curr_len - 1;
                if (s.charAt(i) == s.charAt(j) //1. The first and last characters should match
                        && palindrome[i + 1][j - 1]) //2. Rest of the substring should be a palindrome
                {
                    if (curr_len > max_len) {
                        palindrome[i][j] = true;
                        palindromeBeginsAt = i;
                        max_len = curr_len;
                    }
                }
            }
        }
//        char c = 'a';
//        int i  = (int)(c);
//        System.out.println(i);
        return s.substring(palindromeBeginsAt, max_len + palindromeBeginsAt);

    }


    public static String returnLongestPalindrome(String s) {
        int length = s.length();
        if (s == null || s.length() < 2) {
            return s;
        }
        boolean[][] isPalindrome = new boolean[length][length];

        int left = 0;
        int right = 0;

        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                boolean isInnerWordPalindrome = isPalindrome[i + 1][j - 1] || j - i <= 2;
                if (s.charAt(i) == s.charAt(j) && isInnerWordPalindrome)
                    isPalindrome[i][j] = true;
                if (j - i > right - left) {
                    right = j;
                    left = i;
                }
            }
        }
        return s.substring(left, right + 1);

    }


    public static void main(String args[]) {
        System.out.println(LPS("forgeeksskeegfor"));
        System.out.println(returnLongestPalindrome("forgeeksskeegfor"));
    }
}
