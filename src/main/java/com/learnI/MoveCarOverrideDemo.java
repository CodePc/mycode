package com.learnI;

/**
 * Created by Prem Chand on 9/22/2016.
 */
public class MoveCarOverrideDemo {
    public static void main(String[] args) {
        CarOveride carOveride = new CarOveride(); // here CarOveride is super class extended by all sub class and creating object of same class
        CarOveride bmw = new BMW(); // creating object of BMW class and overriding move method in it
//        new BMW().move(); // similarly its object of AUDI class
        /*
        * here we can see refrence variable CarOveride is taking may form and overriding methods called as polymorphism */
        CarOveride audi = new Audi();
        MoveCarOverrideDemo moveCarOverrideDemo = new MoveCarOverrideDemo();
        moveCarOverrideDemo.chooseCar(audi);
        moveCarOverrideDemo.chooseCar(bmw);
        moveCarOverrideDemo.chooseCar(carOveride);
    }
    public void chooseCar(CarOveride c){
        c.move();
    }
}
