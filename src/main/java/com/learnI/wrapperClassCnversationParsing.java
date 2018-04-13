package com.learnI;

/**
 * Created by prem on 4/16/2017.
 */
public class wrapperClassCnversationParsing {
    public void convertingStingToWrapper() {
        int i = Integer.parseInt("22");
        Integer ii = Integer.valueOf("34");
        System.out.println(ii);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Integer i = new Integer("800");
        int j = i.intValue();
        String s = i.toString();
        int x = Integer.parseInt(s);
        System.out.println(i);
        System.out.println(x);
        System.out.println(s);
        System.out.println(j);
        wrapperClassCnversationParsing wrapperClassCnversationParsing = new wrapperClassCnversationParsing();
        wrapperClassCnversationParsing.convertingStingToWrapper();

        // if we need primitive data type we use
        // parse

//        Byte - > parseByte(String x)

//        if we need wrapper class we use valueof
//        Integer i = Integer.valueOf(String p)

        Integer ii = Integer.valueOf("200");
        ii.parseInt("200");
    }

}
