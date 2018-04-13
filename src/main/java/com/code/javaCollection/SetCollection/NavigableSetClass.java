package com.code.javaCollection.SetCollection;

/**
 * Created by prem on 5/1/2017.
 */
/*TreeSet is the concrete implementation of NavigableSet, SortedSet and Set interfaces.
Treeset is the collection which sorts the elements and maintains that order. TreeSet implements SortedSet, NavigableSet.
Any collection implementation that implements sorted set should sort the elements when they are getting added to the collection.
That means when we fetch the elements from collection they are already sorted.
These are the methods that are declared by SortedSet interface.
you can see that there is no sort method defined here.
That means any sorted set implementation like TreeSet is supposed to sort the elements when we add them to the collection.
you can notice that the methods present in sorted set interface are related to retrieving elements.
The methods first and Last help to get the first and last elements respectively. then we have headset and tailset methods. let me elaborate about these methods.
headSet returns all the elements that are on top of the specified elements
tailSet method will fetch all the elements below the specified element and return a set.
NavigableSet defines the utility methods which can help to navigate through the collection and help to fetch the closest match.
If you take a look at the methods that NavigableSet defines, you see that there is
Cieling method which returns least element in the set with respect to the given element,
Then we have
Floor method which gives the greatest element in the set with respect to the element passed.*/
public class NavigableSetClass {
}
