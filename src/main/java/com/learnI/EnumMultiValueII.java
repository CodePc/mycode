package com.learnI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prem on 4/3/2017.
 */
public class EnumMultiValueII {
    public enum ShareLevel {
        GLOBAL("global", "Global Level"), // Within partner global
        CLIENT("client", "Client Level"),
        USER("user", "User Level"),
        CLIENT_GROUP("client group", "Client Level"),
        USER_GROUP("user group", "User Group Level"),
        ACCOUNT("account", "Account"),
        ACCOUNT_GROUP("account group", "Account Group Level"),
        TOPIC("topic", "Topic Level"),
        TOPIC_GROUP("topic group", "Topic Group Level");

        private String value;
        private String level;

        ShareLevel(String value, String label) {
            this.value = value;
            this.level = label;
        }

        public String getValue() {
            String s= new String("prem");
            s.length();
            String [] p = {"prem"};
            s.length();

            String gg = "Kishan";
            gg.length();

            List<String> pp = new ArrayList<>();
            pp.add("rea");
            pp.size();
            return this.value;
        }

        public String getLevel() {
            return this.level;
        }

    }

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

    }
}
