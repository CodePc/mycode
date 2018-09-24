package com.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prem chand shah on 27-07-2018
 * @project myJava
 */
public class DiffLogicTest {

    public static void logic() {
        List<String> qaList = new ArrayList<>();
        List<String> prodList = new ArrayList<>();
        List<String> newEntityList = new ArrayList<>();
        List<String> commonEntityList = new ArrayList<>();

        qaList.add("aa");
        qaList.add("bb");
        qaList.add("cc");
        qaList.add("zz");

        prodList.add("cc");
        prodList.add("dd");
        prodList.add("bb");
        prodList.add("aa");
        prodList.add("ee");


        for (String qa : qaList) {
            for (String prod : prodList) {
                if (qa.equals(prodList)) {
                   commonEntityList.add(qa);
                }
            }
        }
        qaList.removeAll(prodList);
        System.out.println(qaList);
    }


    public static void main(String[] args) {
        logic();
    }
}
