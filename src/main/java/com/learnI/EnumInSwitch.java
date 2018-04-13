package com.learnI;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Prem Chand on 9/21/2016.
 */
public class EnumInSwitch {
    public enum companyNames {
        Google("goo", "google", "g"), Facebook("fb", "facebook", "f"), Yahoo("yah", "yahoo", "y"), Twitter("tw", "twitter", "t");


        public String value1;
        public String value2;
        private String value3;

        private companyNames(String value1, String value2, String value3) {
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
        }
    }

    public static void main(String[] args) {
        String googleName = companyNames.Google.value1;
        companyNames[] googleCode = companyNames.values();
        System.out.println(companyNames.valueOf("Google"));
        System.out.println(companyNames.valueOf("Facebook"));
        System.out.println(companyNames.Google.value3);

        System.out.println(companyNames.Facebook.value1);
        System.out.println(Arrays.toString(companyNames.values()));
        System.out.println(Arrays.toString(companyNames.values()));
        List str = Arrays.asList(companyNames.values());
        String c = "premchand";
        c.toCharArray();
        switch (companyNames.Facebook.value1) {
            case "goo":
                System.out.println(companyNames.Google);
                break;
            default:
                System.out.println("No cases Found");
        }
    }
}
