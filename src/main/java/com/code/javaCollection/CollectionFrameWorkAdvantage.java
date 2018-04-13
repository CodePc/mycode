package com.code.javaCollection;

import java.util.*;

/**
 * Created by prem on 4/25/2017.
 */
public class CollectionFrameWorkAdvantage {
    /*
Advantages of Collection Framework:
Consistent API : The API has basic set of interfaces like Collection, Set, List, or Map. All those classes
(such as ArrayList, LinkedList, Vector etc) which implements, these interfaces have some common set of methods.
Reduces programming effort: The programmer need not to worry about design of Collection rather than he can focus on its
best use in his program.
Increases program speed and quality: Increases performance by providing high-performance implementations of useful data
structures and algorithms.
    * */
    public static void main(String[] args) {


        // not duplicate in set

        Set<Integer> nSet = new HashSet<>();
        Set<String> mSet = new TreeSet<>();
        Set<String> linkhashSet = new LinkedHashSet<>();
        SortedSet<String> sortedSet = new TreeSet<>();




//        Duplicate is allowed in list but ordered
//        List interface is implemented by all tha these classes

        List<Integer> nList = new LinkedList<>(); // LinkedList is class and List is interface which is implemented by LinkedList class
        List<String> mList = new ArrayList<>(); // as as above
        List<String> stack = new Stack<>();
        List<String > vector = new Vector<>();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0,"prem");


        Queue a = new PriorityQueue(); // FIFO
        Queue<Integer> intQ = new PriorityQueue<>();

//  Deque allow addiction  and removal from both end
//        Deque dQ = new Queue<>();

        // no duplicate
        Map<String, Integer> sI = new HashMap<>();
        Map<String, Integer> tree = new TreeMap<>();
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        NavigableMap<String, Integer> navigableMap = new TreeMap<>();
    }

}
