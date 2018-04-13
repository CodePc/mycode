package com.code.javaCollection.MapCollections;

import java.util.*;

/**
 * Created by prem on 4/30/2017.
 */
public class MapCollection {
    public void mapMethod() {
        // TreeMap class implements Map,SortedMap,NavigableMap interface
        Map<String, String> stringMap = new TreeMap<>(); // sorted
        SortedMap<Integer, String> sortedMap = new TreeMap<>(); // sorted
        NavigableMap<String, String> navigableMap = new TreeMap<>();

        //Hashtable class implements Map Interface
        Map<Integer, String> integerStringMap = new Hashtable<>();

        // HashMap class implements Map
        Map<Character, String> characterStringMap = new HashMap<>(); // un ordered un sorted

        // LinkedHashMap class implements Map interface
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>(); // ordered, unsorted

    }

    public static void main(String[] args) {
        Map<Integer, String> intStr = new HashMap<>();
        String a = intStr.put(1, "prem");
        System.out.println("Value of key 1, is returned as null , if key is unique and added to the map " + a);
        String b = intStr.put(2, "kishan");
        System.out.println("Value of key 1, is returned Old Value of the key , if key is duplicate " + b);
        String removeValue = intStr.remove(1);
        System.out.println("Remove always return value of key we want to remove " + removeValue);

        Iterator<Map.Entry<Integer, String>> iterator = intStr.entrySet().iterator();
        for (String ss : intStr.values()) {
            System.out.println("\n");
            System.out.println(ss);
        }
        while (iterator.hasNext()) {
            System.out.println("\n");
            System.out.println(iterator.next().getKey());
        }
    }
}
