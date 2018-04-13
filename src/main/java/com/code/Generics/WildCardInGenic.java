package com.code.Generics;

/**
 * Created by prem on 4/30/2017.
 */
public class WildCardInGenic {
    private void genericMethod(Glass<?> glass) {
        System.out.println("This is generic method on any instance of class");
    }

    private void genricMethod(Glass<Juice> juiceGlass) {
        System.out.println("This is only on juice class method");
    }

    private void boundedWhildCard(Glass<? extends Liquid> glass) {
        System.out.println("This will take any class what implements Liquid interface");
    }

    public static void main(String[] args) {
        WildCardInGenic wildCardInGenic = new WildCardInGenic();
        wildCardInGenic.genericMethod(new Glass<String>()); // any type of type argument is accepted here, use of wild card
        wildCardInGenic.genricMethod(new Glass<Juice>()); // this will take only juice type no wild card use
        wildCardInGenic.boundedWhildCard(new Glass<orangeJuce>()); // will take class which extends liquid interface
    }
}
