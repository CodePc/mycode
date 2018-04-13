package com.code.javaCollection.ListAndQueueCollections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prem on 4/30/2017.
 */
public class OverrideEqualsMethodExeute {
    public static void main(String[] args) {
        OverrideEqualsMethod overrideEqualsMethod = new OverrideEqualsMethod("prem");
        OverrideEqualsMethod overrideEqualsMethod1 = new OverrideEqualsMethod("prem");
        System.out.println(overrideEqualsMethod.equals(overrideEqualsMethod1));
        System.out.println(overrideEqualsMethod == overrideEqualsMethod1);

        // map can have only unique key
        Map<OverrideEqualsMethod, ReportCard> map = new HashMap<>();
        // both of above gives false because it don't check for content of object it looks instance are same or not
        // so we need to override equals method in OverrideEqualsMethod class
        // equals >> if content of object is same , overriding equals method will do
        // '==' >> if content and hashCode of object is same  , we have to override both equals and hashcode
        // becasue it invoke the equals method given by object class
        OverrideEqualsMethod s1 = new OverrideEqualsMethod("prem");
        OverrideEqualsMethod s2 = new OverrideEqualsMethod("prem");
        map.put(s1, new ReportCard());
        map.put(s2, new ReportCard()); //  overriding equal method will help in only adding single key in map
        System.out.println(map.size());
    }
}
