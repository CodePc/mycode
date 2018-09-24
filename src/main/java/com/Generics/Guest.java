package com.Generics;


/**
 * @author prem chand shah on 13-04-2018
 * @project myJava
 */
public class Guest {
    public static void main(String[] args) {
        Glass glass = new Glass();
        glass.liquide = new Juice();

        Glass<Juice> g = new Glass<Juice>();
        Juice juice = new Juice();
        g.liquide = juice;

        Glass<com.Generics.Water> waterGlass = new Glass<>();
        waterGlass.liquide = new Water();

        Juice j = g.liquide;

        Water water = waterGlass.liquide;

        Color<Red,Blue,Green> color = new Color<Red, Blue, Green>();
        Red red = new Red();

        Bartender bartender = new Bartender();
        bartender.mix(juice,water);


        /**this is correct because we have not defined any restriction on type argument so it
         can take any type(generics)*/
        bartender.mix(red,water);


        /**this is incorrect because we have defined it to be of type Juice, Water
         but we have passee a instance of red*/
       // bartender.<Juice,Water>mix(red,red);

    }
}
