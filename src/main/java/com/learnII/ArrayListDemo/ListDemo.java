package com.learnII.ArrayListDemo;

/**
 * ArrayList is the class that implements collection and List interface
 **/

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Prem Chand on 12/25/2016.
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Car> carsLit = new ArrayList<Car>();
        Car c = new Car("BLR123");
        carsLit.add(c);
        System.out.println(carsLit.size());
        //  carsLit.add(4, c); we cannot insert element any where in collection we can only add at the place when element is there
        for (int i = 0; i <= 5; i++) {
            carsLit.add(new Car("BLR" + i));
            System.out.println(carsLit.get(i));
        }
        carsLit.add(4, c);
        System.out.println(carsLit);
        Iterator<Car> carIterator = carsLit.iterator();
        while (carIterator.hasNext()) {
            System.out.println(carIterator.next());
        }
        //clone method
        ArrayList<Car> carList2 = (ArrayList<Car>) carsLit.clone();

        Iterator<Car> carIterator1 = carList2.iterator();
        while (carIterator1.hasNext()) {
            System.out.println(carIterator1.next());
        }
//        System.out.println( new ("BLR1"));
    }
}