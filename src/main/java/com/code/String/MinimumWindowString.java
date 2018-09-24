package com.code.String;

/**
 * @author prem chand shah on 01-09-2018
 * @project myJava
 */
public class MinimumWindowString {

    private String minWindow(String s, String t) {

        int startIndex = 0;
        int endIndex = 0;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                startIndex = i;

            }
        }
        return null;
    }
}
