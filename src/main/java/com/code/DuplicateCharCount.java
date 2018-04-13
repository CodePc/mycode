package com.code;

import java.util.*;

/**
 * Created by prem on 4/25/2017.
 */
public class DuplicateCharCount {
    void Findrepeter() {
        String s = "mmababctamantlslmag";
        int distinct = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    distinct++;

                }
            }
            System.out.println(s.charAt(i) + "--" + distinct);
            String d = String.valueOf(s.charAt(i)).trim();
            s = s.replaceAll(d, "");
            distinct = 0;
        }

    }

    private void characterCountUsingASCII() { // O(n)
        String ch = new String("dadmnkdskmamsdmwmlke");
        int count = 0, len = 0;
        do {
            try {
                char name[] = ch.toCharArray();
                len = name.length;
                count = 0;
                for (int j = 0; j < len; j++) {
                    // a-z : 65 to 90
                    // A-Z : 90 to 122
                    if ((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97 && name[0] <= 123)))
                        count++;
                }
                if (count != 0)
                    System.out.println(name[0] + " " + count + " Times");
                ch = ch.replace("" + name[0], "");
            } catch (Exception ex) {
            }
        }
        while (len != 1);
    }

    private void usingMap() {
        String str = "asdfasdfafk asd234asda";
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] arr = str.toCharArray();

        for (char value : arr) {

            if (Character.isAlphabetic(value)) {
                if (charMap.containsKey(value)) {
                    charMap.put(value, charMap.get(value) + 1);

                } else {
                    charMap.put(value, 1);
                }
            }
        }

        System.out.println(charMap);
    }

    private void duplicateCount() {
        String string = new String("asdjkjamksldmklas");
        char[] ch = string.toCharArray();
        Map<Character, Integer> dupCountMap = new HashMap<>();

        for (char c : ch) {
            if (dupCountMap.containsKey(c)) {
                dupCountMap.put(c, dupCountMap.get(c) + 1);
            } else {
                dupCountMap.put(c, 1);
            }
        }


//        for (char c : ch) {
//            System.out.println("Key = " + c + "Value : " + dupCountMap.get(c));
//        }

        Set<Character> keys = dupCountMap.keySet();
        for (Character character : keys) {
            System.out.println("Key = " + character + " Value : " + dupCountMap.get(character));
        }
    }

    private void usingHashing() {
        int MAX_SIZE = 256;
        int counter = 0;
        String s = new String("asasdfawedasadsatefe");
        int[] count = new int[MAX_SIZE];
//        count[0] = 32;
////        System.out.println("Array elements are :");
////        for (int i : count) {
////            System.out.println(i);
////        }
//        System.out.println("Lenght should be 256 : \t" + count.length);
//        char ch[] = s.toCharArray();
        for (int p = 0; p < s.length(); p++) {
            count[s.charAt(p)]++;
        }

        for (int i = 0; i < s.length(); i++) {
//            if (max < count[str[i]]) {
//                max = count[str[i]];
//                result = str[i];
//            }
            System.out.println(s.charAt(i) + ":" + count[s.charAt(i)]);

        }
    }

    public static void main(String[] args) {
        DuplicateCharCount duplicateCharCount = new DuplicateCharCount();
//        duplicateCharCount.Findrepeter(); // O(n^2)
//        duplicateCharCount.characterCountUsingASCII();
//        duplicateCharCount.usingMap();
//        duplicateCharCount.duplicateCount();
        duplicateCharCount.usingHashing();
    }
}
