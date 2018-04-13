package com.learnI;

/**
 * Created by prem on 5/14/2017.
 */
public class StringJava {
    /*String is the most widely used object type in Java.
Because of this, String Objects enjoy some extra privilege from JVM
Just like any other object, we can use a new operator to create a String.
There are around thirteen different constructors provided by String class.
We can just use the quotes to create a String object.
Remember that all the strings in Java are maintained as a character array in the background.
String object wraps this array and provides some additional functionality to edit, search and work with text.
All string objects are maintained in a separate heap called String constant pool.
String class is declared as final which makes it not possible to be extended.*/

    // all the string is character array
    // all the sting is allocated in saparet pool call "Sting constant pool"
    //  creating with New >> careate a obj in normal object heap and string constant pool
    //


    ///------------------------------String Buffer and String builder ---------------------------///////

// use String buffer for sting which we will be modifying we can use append
    // String buffer is mutable class

    public static void main(String[] args) {
        String x = "hi";
        System.out.println(x.hashCode());
        x += "sam"; // this is new object now, once we add any thing is string object it created a new object in string constant pool
        // so better use sting buffer
        System.out.println(x.hashCode()); // has code will be different for x as it has created a new object
        System.out.println("\n");

        StringBuffer stringBuffer = new StringBuffer("prem");
        System.out.println(stringBuffer.hashCode());
        stringBuffer.append(" chand");
        System.out.println(stringBuffer.hashCode()); // here hash code is same as sting buffer is mutable and don't create any new object if string is modified
        System.out.println();
        System.out.println(stringBuffer);
        stringBuffer.indexOf("Kishan", 3);
        stringBuffer.insert(4, "munna");


        // Sting builder Vs Sting buffer
        // >> String builder is faster, it there is not thread safety because not lock for synchronized call

        ///  string buffer is thread safe but sting builder is not thread safe
        // method to modify in sting builder is not synchronized
    }

}
