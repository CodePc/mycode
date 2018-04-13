package com.code.javaCollection.SetCollection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by prem on 5/5/2017.
 */
public class RemoveDuplicateInString {
    public static void main(String[] args) {


        String string = "aabbccdefatafaz";

        char[] chars = string.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
    }
}
