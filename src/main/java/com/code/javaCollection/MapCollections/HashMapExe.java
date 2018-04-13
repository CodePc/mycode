package com.code.javaCollection.MapCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by prem on 5/1/2017.
 */
public class HashMapExe {
    public static void main(String[] args) {
        HashMap<CarDetails, CarOwner> carDetails = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            carDetails.put(new CarDetails("H" + i), new CarOwner());
        }

        // using Iterator of key
        Iterator<CarDetails> carDetailsIterator = carDetails.keySet().iterator();
        while (carDetailsIterator.hasNext()) {
            CarDetails c = carDetailsIterator.next();
            System.out.println("Reg No : " + c.getRegNo() + ", " + "Owner Name: " + carDetails.get(c).getOwnerName());
        }

        // EntrySet Implemention

        Set<Map.Entry<CarDetails, CarOwner>> entrySet = carDetails.entrySet();
        Iterator<Map.Entry<CarDetails, CarOwner>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<CarDetails, CarOwner> c = entryIterator.next();
            c.getKey();
            c.getValue();
            System.out.println("carRegNo: " + c.getKey().getRegNo() + ", " + "carOwnerName: " + c.getValue().getOwnerName());
        }

        Set<Map.Entry<CarDetails, CarOwner>> c = carDetails.entrySet();
        Iterator<Map.Entry<CarDetails,CarOwner>> d = c.iterator();

        Iterator<Map.Entry<CarDetails, CarOwner>> i = c.iterator();

        /*VVI*

        /- HashTable VS HashMap
        - all the method of hashMap is supported by hashTable
        - hashTable is thread saft, only single thread can manupliate it at single instance
        - hashMap is not thread safty
        - We can use syncMap of collectons utility calss to make hashMap sync
         */
    }
}
