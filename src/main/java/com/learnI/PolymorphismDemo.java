package com.learnI;

import com.learnII.SalarySuperKeywordDemo;

/**
 * Created by Prem Chand on 9/21/2016.
 */
public class PolymorphismDemo {
    public static void main(String [] args) {
        SalarySuperKeywordDemo s = new SalarySuperKeywordDemo("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new SalarySuperKeywordDemo("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using SalarySuperKeywordDemo reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
