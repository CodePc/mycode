package com.code.String;

/**
 * Created by prem on 4/24/2017.
 */
public class StringBufferTest {
    // StringBuffer( ): It reserves room for 16 characters without reallocation.
    //StringBuffer is a peer class of String that provides much of the functionality of strings. String represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
    // StringBuffer may have characters and substrings inserted in the middle or appended to the end
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("GeeksforGeeks");
        int p = s.length();
        int q = s.capacity();
        s.length();
        System.out.println("Length of string GeeksforGeeks=" + p);
        System.out.println("Capacity of string GeeksforGeeks=" + q);
        s.insert(5, "fooor"); // insert( ): It is used to insert text at the specified index position. These are a few of its forms:
        System.out.println(s); //returns GeeksforGeeks
        s.insert(0,5);
        System.out.println(s); //returns 5GeeksforGeeks
        s.reverse();
        System.out.println(s); //returns skeeGrofskeeG
    }
}
