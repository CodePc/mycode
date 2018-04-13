package com.code.javaCollection.ListAndQueueCollections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by prem on 4/30/2017.
 */
/*LinkedList is an Ordered collection. It is an interesting implementation of List and it has some extra functionality compared to ArrayList and Vector.

So, if you take a look at the hierarchy of LinkedList, you can see that it is from List and it is also implmenting the Queue and Double ended queue interfaces.
So, most of the methods from List have been discussed in ArrayList module. We will focus on the queue and double ended queue features of LinkedList.
So, what is the difference between the normal list based implementations like ArrayList, Vector vs LinkedList.

With ArrayList or Vector, when we add an element without specifying an index, they place that element at the end of the list by default.

AddFirst method adds element to the beginning of List
AddLast method adds the element at the end of the List
getFirst method returns the first and getLast returns the last element in the list
removeFirst and removeLast methods remove the first and last elements respectively.
With LinkedList, because it is a Doubled ended queue, we can add the element to the front or at the end of the list.
To enable this, LinkedList implements a range of methods to be able to add, remove and get elements from front or from end of the collection.

So, LinkedList implementing the Dqueue interface is like double edged sword. If you think the element you want can be
reached from end of collection, we can use this or if from the first, we then have normal iterator.
* */
public class LinkedListClass {

    // LinkedList class inplements Queue , dquque and list interface
    // we see queue and dqueue (double ended queue)
    // Queue >> added a element at end of list
    // but we can only access from 1st or last of queue (dQueue)
    // FILO and FIFO both are impleted by queue interface

    public void queueMethod() {
        LinkedList<CarClass> stringQueue = new LinkedList<>();
        for (int i = 0; i <= 100; i++) {
            stringQueue.add(new CarClass("LinkedList" + (i++)));
        }

        // This term are used while implementing Q
        stringQueue.addFirst(new CarClass("First Car"));
        stringQueue.addLast(new CarClass("Last Car"));

        stringQueue.removeFirst();
        stringQueue.removeLast();


        System.out.println("First el" + stringQueue.getFirst().getRegNo());
        System.out.println("last el" + stringQueue.getLast().getRegNo());

        System.out.println(stringQueue.peek().getRegNo()); // retrive 1st element
        System.out.println(stringQueue.peekFirst().getRegNo()); // retrive 1st eleemnt
        System.out.println(stringQueue.peekLast().getRegNo()); // retrive last elment


        System.out.println(stringQueue.poll().getRegNo()); // remove 1st element
        System.out.println(stringQueue.pollFirst().getRegNo()); // remove 1st element
        System.out.println(stringQueue.pollLast().getRegNo()); // remove last elemet

        System.out.println(stringQueue.offer(new CarClass("offer1"))); // add at tail
        System.out.println(stringQueue.offerFirst(new CarClass("offerFirest1"))); // add at 1st index
        System.out.println(stringQueue.offerLast(new CarClass("offerLast1"))); // add at last

        Iterator<CarClass> carClassIterator = stringQueue.descendingIterator(); // descending iterator ,iteratre from last
        while (carClassIterator.hasNext()) {
            System.out.println(carClassIterator.next().getRegNo());
        }

    }

    public static void main(String[] args) {
        LinkedListClass linkedListClass = new LinkedListClass();
        linkedListClass.queueMethod();
    }

}
