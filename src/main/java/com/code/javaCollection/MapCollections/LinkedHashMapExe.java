package com.code.javaCollection.MapCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by prem on 5/1/2017.
 */

// linkedHashMap >> linked , order map collection
public class LinkedHashMapExe {
    public static void main(String[] args) {
        Map<CarDetails, CarOwner> linkedMap = new LinkedHashMap<>();
        for (int i = 0; i < 6; i++) {
            linkedMap.put(new CarDetails("P" + i), new CarOwner());
        }
        System.out.println("ORDER FOR LinkedHashMap");
        LinkedHashMapExe.mapIterator(linkedMap);
        Map<CarDetails, CarOwner> map = new HashMap<>();
        System.out.println("pull all in another hashMap NO ORDER for hashMap");
        map.putAll(linkedMap);
        mapIterator(map);

        Map<CarDetails, CarOwner> map1 = new LinkedHashMap<>(20, 2f, true);
        map1.putAll(linkedMap);
        System.out.println("From Map1");
        mapIterator(map1);
        System.out.println("Get Method used in LUR caching ");
        map1.get(new CarDetails("P3"));
        mapIterator(map1);

        Map<CarDetails, CarOwner> order = new LinkedHashMap<>(10, 2f, true);

        //------VVT-----------//
        // true >> main access order instead of insertion order, this is used in LUR, most recent accessed will be at last of Collection
        // 10 >> initial capacity
        // 2f >> load factor

    }

    public static void mapIterator(Map<CarDetails, CarOwner> map) {
        Iterator<Map.Entry<CarDetails, CarOwner>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<CarDetails, CarOwner> c = iterator.next();
            System.out.println("Car regNo. : " + c.getKey().getRegNo() + ", " + "Owner Name :" + c.getValue().getOwnerName());
        }
    }
}
