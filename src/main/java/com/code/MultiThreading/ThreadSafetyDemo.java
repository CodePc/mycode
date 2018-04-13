package com.code.MultiThreading;

/**
 * Created by prem on 5/14/2017.
 */
public class ThreadSafetyDemo {
    public static void main(String[] args) {
        BusReservation br = new BusReservation();
        PassengerThread pt1 = new PassengerThread(2, br, "SAM");
        PassengerThread pt2 = new PassengerThread(2, br, "Jack");
        pt1.start();
        pt2.start();
    }
}
