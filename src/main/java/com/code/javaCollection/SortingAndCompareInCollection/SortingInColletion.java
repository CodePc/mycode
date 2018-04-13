package com.code.javaCollection.SortingAndCompareInCollection;

/**
 * Created by prem on 5/1/2017.
 *//*
 * To sort the elements, we should be able to compare the element with another element and only then we can judge which one should go first and which in the next position.

Java collections framework has an interface called Comparable which has a method called compareTo method.

CompareTo method is where the criteria is declared and this is called natural ordering for that kind of objects

So, How does compareTo method decides which object is less than, equal or greater than an object?

compareTo method accepts an object of same instance type and based on certain criteria defined, it returns an integer which
indicates if an object is less or greater or equal in ordering.
This Collections class defines two methods called Sort and Sort a list with a comparator.

These two methods accept a List as a collection and orders all the elements based on certain criteria.

Now, if you observe the signature of the sort method, you can see that it is static and it only accepts the collection with
elements which has implemented the comparable interface.


This is because, without implementing Comparable, the will be no compareTo which defines the natural ordering of elements.

You can see that this documentation clearly states that it uses natural ordering which means that it relies on compareTo method.
Collections framework has an interface called Comparator which defines compare method.

It accepts two objects of a type and compares both on certain criteria and then returns an integer.

Similar to compareTo method, this method also returns a -ve integer or +ve integer or zero.

If a negative integer is returned, first argument is less or comes after the second object.

If a positive integer is returned, first argument is comes first and second one always after the first one.

If zero, then both stand at the same level in ordering.
*/
public class SortingInColletion {


}
