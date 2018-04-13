package com.code.javaCollection.SetCollection;

import com.code.javaCollection.ListAndQueueCollections.CarClass;

import java.util.*;

/**
 * Created by prem on 4/30/2017.
 */
/*
* A Set is a collection of Unique elements.
Set implementation like HashSet, LinkedHashSet and TreeSet should not allow any duplicate object into it.
HashSet is only Unordered and UnSorted. LinkedHashSet is an ordered collection based on the insertion.
Coming to TreeSet, it sorts all its elements so they are ordered based on the sorting criteria.
HashSet is Unordered and Unsorted collection.

It does not allow duplicates and we cannot predict the iteration order.

Then linkedhashSet is ordered as it arranges the elements in the same order as they were inserted.

It also does not allow duplicates

The iterator fetches the elements as they were inserted. So, if you want a collection which should not allow duplicates and should maintain the order, then we can use LinkedHashSet
*/
// Difference btween hashSet and linkedHashSet is hashset is ounordered unsorted but linkedhashset is sorted
public class SetCollection {
    public void setMethods() {

        // HashSet, LinkedHashSet class implements Set
        Set<Integer> integers = new HashSet<>();
        Set<String> strings = new LinkedHashSet<>();

        // TreeSet class implements set , sortedSet,NavigableSet
        Set<String> strings1 = new TreeSet<>();
        SortedSet<Integer> integerSortedSet = new TreeSet<>();
        NavigableSet<String> navigableSetClass = new TreeSet<>();
    }

    public void setMethod() { // unordered and unsorted
        HashSet<CarClass> carClasses = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            carClasses.add(new CarClass("SetCar" + i));
        }
        Iterator<CarClass> carClassIterator = carClasses.iterator();
        while (carClassIterator.hasNext()) {
            System.out.println(carClassIterator.next().getRegNo());
        }
    }

    public void LinkedHashSet() { // ordered sert
        Set<CarClass> carClassSet = new LinkedHashSet<>();
        for (int i = 0; i <= 100; i++) {
            carClassSet.add(new CarClass("LinkedHashSetCar" + i));
        }
        Iterator<CarClass> carClassIterator = carClassSet.iterator();
        while (carClassIterator.hasNext()) {
            System.out.println(carClassIterator.next().getRegNo());
        }
    }

    public void sortedSets() {
        SortedSet<Integer> sortedSet = new TreeSet<>(); // sorted set
        sortedSet.add(32);
        sortedSet.add(34);
        sortedSet.add(21);
        sortedSet.add(87);
        Iterator<Integer> i = sortedSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(sortedSet);
        System.out.println("Set as sorted list");
        List<SortedSet<Integer>> ss = Arrays.asList(sortedSet);
        System.out.println(ss);
        System.out.println("Set as Arrays list");
        System.out.println(Arrays.asList(sortedSet));
        List<LinkedList<Integer>> aa = new ArrayList<>();
    }

    public static void main(String[] args) {
        SetCollection setCollection = new SetCollection();
//        setCollection.setMethod();
        //       setCollection.LinkedHashSet();
        setCollection.sortedSets();
    }
}
