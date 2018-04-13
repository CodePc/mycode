package com.code.javaCollection.ListAndQueueCollections;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by prem on 4/30/2017.
 */
public class ListCollection {
    public void listMethods() {
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new LinkedList<>();
        List<Character> characterList = new Vector<>();
    }

    public void arrayList() {

        /*- add a element in sequence order
        - with integer index
        - same as array but expandable
        List is an ordered collection. It arranges its elements in a sequence with an index. A list is very similar to
        an Array except that an Array cannot expand in size but a list can expand when and then we try to insert a new element.
    ArrayList is the concrete implementation of the Collection and List interfaces.
    ArrayList is the most frequently used Collection. So, if you notice the methods with an index in the method signature,
    then they are added by the List interface and most of the other methods you see are from the Collection interface.
    Please remember that most of these methods are common in other collection types like Set and Queue.*/
        // ArrayList is same as array but it is expandable
        // ArrayList can be of generic type but array cannot
        // add
        // add(int index , E e)
        // add all
        // clear

//-----------------------------------------------------
//        Different between vetro and arrayList
        // - 1st implementation on List
        /* - vector is thread safe and ArrayList is not
        - that means , array list can be manuplited by multple thread at any time
        - better performance for arrayThis because it is async process, no need to wait for other thread
        - if add any thing in arrayList it grows by half of its size, but vector grow 2 * current size
        - vector can be used in single thread application
        - multithreaded application - arrayList
        * */
//        ----------------------------------------------
        // else we can make arrayList a thread saftey to have sync call

        List list = Collections.synchronizedList(new ArrayList()); // this thread saftey array list

    }
}
