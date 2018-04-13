package com.learnI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prem on 4/13/2017.
 */
public class LengthConcept {

class test {
    String ss = EnumMultiValue.States.valueOf("sas").getFullName().toString().concat("adsas")+
            (EnumMultiValue.States.valueOf("asd").getAbbreviatedName());
}

    public static void main(String[] args) {
        String [] arr = new String[20];
        double [] asss = new double[32];
        int p = asss.length;
        int i = arr.length;
        Character ch = new Character('a');
        ch.charValue();
        String ppppp = "prem chand shah";
        ppppp.length();
        String s= new String("prem");
        s.length();
        String [] p1 = {"prem"};
        s.length();

        String gg = "Kishan";
        gg.length();

        List<String> pp = new ArrayList<>();
        pp.add("rea");
        pp.size();

    }
}
