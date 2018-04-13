package com.learnI;

/**
 * Created by Prem Chand on 9/22/2016.
 */
public class CarOveride {
    public void move() {
        System.out.println("Car move normally");
    }
}
    class BMW extends CarOveride {
        public void move() {
            System.out.println("BMW more smoothly");
        }
    }

    class Audi extends CarOveride {
        public void move() {
            System.out.println("Audi move fast");
        }
    }


