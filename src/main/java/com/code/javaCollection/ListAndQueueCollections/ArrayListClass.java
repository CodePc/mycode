package com.code.javaCollection.ListAndQueueCollections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by prem on 4/30/2017.
 */
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<CarClass> carClasses = new ArrayList<>();
        CarClass BMW = new CarClass("123");
        CarClass AUDI = new CarClass("111");
        CarClass MARUTI = new CarClass("000");

        // add methid
        carClasses.add(BMW);
        carClasses.add(AUDI);
        carClasses.add(MARUTI);
        carClasses.add(new CarClass("121"));
        // add at index
        carClasses.add(4, new CarClass("4343"));
        boolean b = carClasses.add(new CarClass("acb"));
        System.out.println(b);
        if (b) {
            System.out.println("Added at : " + carClasses.indexOf(new CarClass("acb")) + "\n" +
                    " added element is : " + carClasses.get(carClasses.size() - 1).getRegNo());
        }

        ArrayList<CarClass> carClasses2 = new ArrayList<>();

//         clone method
        carClasses2 = (ArrayList<CarClass>) carClasses.clone();

//        Iterator<CarClass> carClassIterator2 = carClasses2.iterator();
//        while (carClassIterator2.hasNext()) {
//            System.out.println(carClassIterator2.next().getRegNo());
//        }

        Iterator<CarClass> carClassIterator = carClasses.iterator();

        while (carClassIterator.hasNext()) {
            System.out.println(carClassIterator.next().getRegNo());
        }

        // contains
        System.out.println(carClasses.contains(new CarClass("121"))); // this gives false but it should has given true as 121 is in List
        // contain will execute equals and hashcode of particular element, and those instance are different

        // get metod
        System.out.println(carClasses.get(0).getRegNo());
        System.out.println(carClasses.get(4).getRegNo());

        // isEmpty
        if (!carClasses.isEmpty()) {
            System.out.println("We have elemnt in array");
        } else System.out.println("We don't have element");

        // for loop size

        for (int i = 0; i < carClasses.size(); i++) {
        } // BAD :each and evey time we are making call to collection w
        for (int j = 0, n = carClasses.size(); j < n; j++) {
        } // GOOD: store lenght and than iterator

        // Indexof
        System.out.println(carClasses.indexOf(new CarClass("123")));

        for (int i = 0; i <= 100; i++) {
            carClasses.add(i, new CarClass("NP" + i));
        }
        System.out.println("TIME" + System.nanoTime());
        System.out.println("Size of element: " + carClasses.size());
    }
}
