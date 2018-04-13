package com.code.javaCollection.ListAndQueueCollections;

import java.util.ArrayList;

/**
 * Created by prem on 4/19/2017.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<UsedCar> usedCars = new ArrayList<UsedCar>();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        UsedCar c = new UsedCar("hhhh");
        usedCars.add(c);
        System.out.println(usedCars.size());

        for (int i = 0; i < 6; i++) {
            usedCars.add(new UsedCar("HA" + i));
        }

        usedCars.add(4, new UsedCar("addedAt4")); // if we add to any index it will push element at next place. it wll not replace
        usedCars.remove(5); //remove element at index 5

        System.out.println(usedCars.size());
        for (UsedCar usedCar : usedCars) {
            System.out.println(usedCar.getRegNo());
        }
        System.out.println("at 1");
        System.out.println(usedCars.get(1).getRegNo());

        if(!usedCars.isEmpty()){
            // instead of userCars.size()!=0 use isEmpty();

        }

        System.out.println(usedCars.indexOf("HA4")); // this will not work unless it is overridden

    }

}
