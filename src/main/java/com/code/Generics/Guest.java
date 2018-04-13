package com.code.Generics;

/**
 * Created by prem on 4/30/2017.
 */
public class Guest {
    public static void main(String[] args) {
        Glass<Juice> glass = new Glass();
        Juice juice = new Juice();
        glass.liquid = juice;
        Glass<Water> waterGlass = new Glass<>();
        waterGlass.liquid = new Water();


        // retrieve
        Juice g = glass.liquid;
        Water water = waterGlass.liquid;
        InheritanceWithGenrics<Water> inheritanceWithGenrics = new InheritanceWithGenrics<Water>();
//        InheritanceWithGenrics<GenricsAtMethodLevel> inheritanceWithGenrics1 = new InheritanceWithGenrics<Water>(); >> invalid
//        InheritanceWithGenrics<Water> inheritanceWithGenrics1 = new InheritanceWithGenrics<Juice>(); type is diff so not inheritance
        InheritanceWithGenrics<orangeJuce> orangeJuceInheritanceWithGenrics = new InheritanceWithGenrics<orangeJuce>();
    }
}
