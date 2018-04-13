package com.code.javaCollection.SortingAndCompareInCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by prem on 5/1/2017.
 */
public class CompareExe {
    public static void main(String[] args) {
        ArrayList<CompareCar> compareCars = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            CompareCar c = new CompareCar(i, "H"+i*2);
            c.setPrice(100 + i * 2);
            compareCars.add(c);
        }

        Iterator<CompareCar> compareCarIterator = compareCars.iterator();

        while (compareCarIterator.hasNext()) {
            CompareCar cc = compareCarIterator.next();
            System.out.println(cc + "price" + cc.getPrice());
        }

        System.out.println("AFTER SORTING PRICE");
        Collections.sort(compareCars);
        Iterator<CompareCar> compareCarIterator1 = compareCars.iterator();
        while (compareCarIterator1.hasNext()) {
            System.out.println(compareCarIterator1.next().getPrice());
        }

    }
}
