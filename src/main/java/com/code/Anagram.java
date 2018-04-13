package com.code;

/**
 * Created by prem on 4/14/2017.
 */
public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 != len2) ;
//            return;
//        if (s1.compareTo(s2) == 0) {
//            System.out.println("Is anagram");
//            return;
//        }
        boolean status = checkIfAnagram(s1, s2, len1, len2);
    }

    private static boolean checkIfAnagram(String s1, String s2, int len1, int len2) {
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {

            }
        }
        return true;
    }
}
