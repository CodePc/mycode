package com.learnII;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SuperClassII Chand on 7/14/2016.
 * It will only eliminate duplicate but no sorting while retriving data
 */
public class Hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap(); //It will only eliminate duplicate but no sorting while retrieving data
        Map<String,Integer > contact = new HashMap<>();
//        contact.put("Prem",9481749147);
        map.put(1, "prem");
        map.put(3, "golu");
        map.put(2, "Gudiya");
        map.put(4, "soni");
        for (Integer key : map.keySet()) {
            System.out.println("Key set =" + key);
        }
        for (String value : map.values()) {
            System.out.println("value =" + value);
        }

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.size();
        map2.isEmpty();
        map2.put("prem", "chand");
        map2.values();
        map2.remove("prem");
    }
}