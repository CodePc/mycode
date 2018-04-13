package com.code.javaCollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by prem on 4/26/2017.
 */
/*1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization
code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
3. HashMap is generally preferred over HashTable if thread synchronization is not needed
Why HashTable doesn’t allow null and HashMap does?
To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hashCode method
and the equals method. Since null is not an object, it can’t implement these methods. HashMap is an advanced version and
improvement on the Hashtable. HashMap was created later.*/
public class HashTableAndHashMapDiff {
    public static void main(String args[]) {
        //----------hashtable -------------------------
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(101, " ajay");
        ht.put(101, "Vijay");
        ht.put(102, "Ravi");
        ht.put(103, "Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //----------------hashmap--------------------------------
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(104, "Amit");  // hash map allows duplicate values
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
