package com.code.MultiThreading;

/**
 * Created by prem on 5/13/2017.
 */
public class RacerExe {
    public static void main(String[] args) {
        Racer racer = new Racer();
        Thread tortoise = new Thread(racer, "Tortoise");
        Thread rabbit = new Thread(racer, "Rabbit");
        tortoise.start();
        rabbit.start();
    }
}
