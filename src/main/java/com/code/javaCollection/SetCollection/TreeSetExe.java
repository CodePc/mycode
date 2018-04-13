package com.code.javaCollection.SetCollection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by prem on 5/1/2017.
 */
public class TreeSetExe {
    public static void main(String[] args) {
        TreeSet<TreeSetClass> carTreeSet = new TreeSet<TreeSetClass>();
        for (int i = 0; i <= 100; i++) {
            TreeSetClass c = new TreeSetClass("H-" + i);
            c.setPrice((int) (Math.random() * 100) + 1);
            carTreeSet.add(c);
        }

        Iterator<TreeSetClass> carIterator = carTreeSet.iterator();
        while (carIterator.hasNext()) {
            TreeSetClass c = carIterator.next();
            System.out.println(c.toString() + "price : " +
                    +c.getPrice());
        }
        System.out.println("Size: " + carTreeSet.size());

        // 1st and last elemet
        System.out.println("First element" + carTreeSet.first());
        System.out.println("last element " + carTreeSet.last());

        System.out.println("After headset 20");

        TreeSetClass c3 = new TreeSetClass("H-10");
        c3.setPrice(20);
//        System.out.println(carTreeSet.headSet(c3));
//        System.out.println(carTreeSet.tailSet(c3));

        Iterator<TreeSetClass> head = carTreeSet.headSet(c3).iterator();
        Iterator<TreeSetClass> tail = carTreeSet.tailSet(c3).iterator();
        while (head.hasNext()) {
            System.out.println(head.next().getPrice());
        }
        System.out.println("AFTER tails set 20");
        while (tail.hasNext()) {
            System.out.println(tail.next().getPrice());
        }

        // Navigable set methods
        System.out.println("Celling and floor of navigable set");
        System.out.println(carTreeSet.ceiling(c3));
        System.out.println(carTreeSet.floor(c3));
        System.out.println("high and low of navigable set ");
        System.out.println(carTreeSet.higher(c3));
        System.out.println(carTreeSet.lower(c3));


    }
}
