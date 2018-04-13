package com.code.javaCollection;

import java.util.Hashtable;
import java.util.Vector;

/**
 * Created by prem on 4/25/2017.
 */
public class WhyCollectionInterFaceIsRequired {
   /* Before Collection Framework (or before JDK 1.2) was introduced, the standard methods for grouping Java objects (or collections) were array or Vector or Hashtable. All three of these collections had no common interface.
    For example, if we want to access elements of array, vector or Hashtable. All these three have different methods and syntax for accessing members:
// Java program to show whey collection framework was needed*/

    public static void main(String[] args) {
        // Creating instances of array, vector and hashtable
        int arr[] = new int[]{1, 2, 3, 4};
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();
        v.addElement(1);
        v.addElement(2);
        h.put(1, "geeks");
        h.put(2, "4geeks");

        // Array instance creation requires [], while Vector
        // and hastable require ()
        // Vector element insertion requires addElement(), but
        // hashtable element insertion requires put()

        // Accessing first element of array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        // Array elements are accessed using [], vector elements
        // using elementAt() and hashtable elements using get()
    }
}
