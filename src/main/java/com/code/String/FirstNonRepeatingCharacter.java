package com.code.String;

/**
 * <b>IDeserve <br>
 * <a href="https://www.youtube.com/c/IDeserve">https://www.youtube.com/c/IDeserve</a>
 * Find the first non repeating character in string.
 * Example:
 * Input: ABCDEFGHIJKLADTVDERFSWVGHQWCNOPENSMSJWIERTFB
 * Output: K
 */
public class FirstNonRepeatingCharacter {

    public static Character getFirstNonRepeatingCharacterLinearOptimized(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }

        int n = string.length();
        if (n == 1) {
            return string.charAt(0);
        }

        int[] charIdx = new int[256];   // Index of non repeating characters. If repeating, then index = -2
        // Initialize character index of all characters to -1
        for (int i = 0; i < 256; i++) {
            charIdx[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (charIdx[string.charAt(i)] == -1) {
                // character seen first time
                charIdx[string.charAt(i)] = i;
            } else {
                // Repeated character
                charIdx[string.charAt(i)] = -2;
            }
        }

        int minIdx = n; // Index of first non repeating character
        for (int i = 0; i < 256; i++) {
            if (charIdx[i] >= 0 &&
                    minIdx > charIdx[i]) {
                minIdx = charIdx[i];
            }
        }
        return (minIdx >= 0 && minIdx < n) ? string.charAt(minIdx) : null;
    }

    public static Character getFirstNonRepeatingCharacterLinear(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }

        int n = string.length();
        if (n == 1) {
            return string.charAt(0);
        }

        int[] charCounts = new int[256];
//        Arrays.fill(charCounts,0); // we can use this to initialize all the array element with any value
        // Initialize character counts of all characters to 0
        for (int i = 0; i < 256; i++) {
            charCounts[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            charCounts[string.charAt(i)]++;
        }

        for (int i = 0; i < n; i++) {
            if (charCounts[string.charAt(i)] == 1) {
                return string.charAt(i);
            }
        }
        return null;
    }

    public static Character getFirstNonRepeatingCharacterNaive(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }

        int n = string.length();
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (i != j && string.charAt(i) == string.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return string.charAt(i);
            }
        }
        return null;
    }

    public static final class p {
        public static int prem;
        final static String s = new String("");
        
    }

    public static void main(String[] args) {
        String string = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
//        System.out.println("Output: " + getFirstNonRepeatingCharacterLinearOptimized(string));
        System.out.println(getFirstNonRepeatingCharacterLinear(string));
    }
}