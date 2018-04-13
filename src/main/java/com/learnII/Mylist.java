package com.learnII;

import java.util.ArrayList;
import java.util.List;
//import

/**
 * Created by SuperClassII Chand on 7/18/2016.
 */
public class Mylist {
    public static void main(String[] args) {
//        List<Map<String,String>> l = new ArrayList<Map<String,String>>();
        List<String> list = new ArrayList<>();
        list.add("prem");
        list.add("SuperClassI");
        String p = list.get(0);
        String k = list.get(1);
//        String u = l.get(2);
        System.out.println(p + "\t" + k + "\t");
        for (String item : list)
            System.out.print(item + "\t");
        System.out.println();
//
//        for (int i = 0; i < list.size(); ++i)
//            System.out.print(list.get(i) + "\t");
    }

}

