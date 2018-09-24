package com.code.javaCollection.MapCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by prem on 5/2/2017.
 */
public class FirstNonRepeated {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String nonRepeat = new String("kjansdjkainsdjnnsdankjdnkakjdab");
        String s1 = new String("listen");
        String s2 = new String("ntelsi");
        boolean b = isAnagram(s1, s2);
        if (b) System.out.println("Anagram");
        else System.out.println("Not Anagram");

        char c = firstNonRepeatedCharacter(nonRepeat);
        System.out.println("The first non repeated character is :  " + c);
    }


    public static boolean isAnagram(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        HashMap<Character, Integer> mapS1 = new HashMap<>();
        HashMap<Character, Integer> mapS2 = new HashMap<>();
        Iterator<Map.Entry<Character,Integer>> itt = mapS1.entrySet().iterator();
        for (int i = 0; i < l1; i++) {
            char c = s1.charAt(i);
            if (mapS1.containsKey(c)) {
                mapS1.put(c, mapS1.get(c) + 1);
            } else
                mapS1.put(c, 1);
        }
        for (int i = 0; i < l2; i++) {
            char c = s2.charAt(i);
            if (mapS2.containsKey(c)) {
                mapS2.put(c, mapS2.get(c) + 1);
            } else
                mapS2.put(c, 1);
        }

        if (l1 != l2) {
            return false;
        } else if (mapS1.keySet().equals(mapS2.keySet())) {
            return true;
        } else
            return false;
    }


    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
        int i, length;
        Character c;
        length = str.length();  // Scan string and build hash table
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterhashtable.containsKey(c)) {
                // increment count corresponding to c
                characterhashtable.put(c, characterhashtable.get(c) + 1);
            } else {
                characterhashtable.put(c, 1);
            }
        }
        // Search characterhashtable in in order of string str


        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterhashtable.get(c) == 1)
                return c;
        }
        return null;
    }

    /*String s = "aaabbbccc";

Map<Character, Integer> stringHash = new HashMap<Character, Integer>();
for (char ch : s.toCharArray())
    stringHash.put(ch, stringHash.containsKey(ch) ? (stringHash.get(ch) + 1) : 1);

System.out.println(stringHash);*/
}

