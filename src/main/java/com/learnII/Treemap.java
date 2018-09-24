package com.learnII;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by SuperClassII Chand on 7/14/2016.
 * eliminates duplicate and sorts
 */
public class Treemap {

        public static void main(String[] args) {
            Map<Integer, String> map = new TreeMap(); //eliminates duplicate and sorts
            map.put(1, "prem");
            map.put(3, "golu");
            map.put(2, "Gudiya");
            map.put(4, "soni");
            map.put(1,"kishan");

            for (Integer key : map.keySet()) {
                System.out.println("Key set =" + key);
            }
            for (String value : map.values()) {
                System.out.println("value =" + value);
            }
        }
    }


