package com.code.javaCollection.SetCollection;

import java.util.*;

/**
 * Created by prem on 4/25/2017.
 */
public class Set_example {

    public static void main(String[] args) {
        Set_example set_example = new Set_example();
//        set_example.setOperation();
        //set_example.setAdd();
        set_example.setOperation();
    }

    void setAdd() {
        // Set deonstration using HashSetDemo
        // ordered collection
        // no duplicate
        // Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
        // Set has various methods to add, remove clear, size, etc to enhance the usage of this interface

        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        hash_Set.add("Set");
        System.out.print("Set output without the duplicates");

        System.out.println(hash_Set);

        // Set deonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);
    }

    void setOperation() {
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[]{1, 3, 2, 4, 8, 9, 3232, 0}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

        Set<Integer> test = new HashSet<Integer>();
        test.addAll(Arrays.asList(new Integer[]{21, 21, 1, 21}));

        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b); // this will not allow duplicate
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b); // retain common
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b); // remove all element in b
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
}
