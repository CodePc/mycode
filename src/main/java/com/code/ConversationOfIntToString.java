package com.code;

/**
 * Created by prem on 4/24/2017.
 */
public class ConversationOfIntToString {
    public static void main(String[] args) {
        int a = 1234;
        int b = -1234;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        System.out.println("String str1 = " + str1);
        System.out.println("String str2 = " + str2);
        int c = 1234;
        String str3 = String.valueOf(c);
        System.out.println("String str3 = " + str3);
        String strr = String.valueOf(1234);
        System.out.println("String str3 = " + strr);
        int d = 1234;
        Integer obj = new Integer(d);
        String str4 = obj.toString();
        System.out.println("String str4 = " + str4);
        int dd = 1234;
        String strrr = new Integer(dd).toString();


        // Swap withOut using 3rd variable
        // Declare two strings
        String aa = "Hello";
        String bb = "World";

        // Print String before swapping
        System.out.println("Strings before swap: a = " +
                aa + " and b = " + bb);

        // append 2nd string to 1st
        aa = aa + bb;

        // store intial string a in string b
        bb = aa.substring(0, aa.length() - bb.length());

        // store initial string b in string a
        aa = aa.substring(bb.length());

        // print String after swapping
        System.out.println("Strings after swap: a = " +
                aa + " and b = " + bb);
    }
    // different between string string builder and string buffer
    // Concatenates to String

    public static void concat1(String s1) {
        s1 = s1 + "forgeeks";
    }

    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2) {
        s2.append("forgeeks");
    }

    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3) {
        s3.append("forgeeks");
    }
}
// ---------------------------------------------------------------------

    /*1. Concat1 : In this method, we pass a string “Geeks” and perform “s1 = s1 + ”forgeeks”. The string passed from main() is not
 changed, this is due to the fact that String is immutable. Altering the value of string creates another object and s1 in concat1() stores reference of new string. References s1 in main() and cocat1() refer to different strings.

2. Concat2 : In this method, we pass a string “Geeks” and perform “s2.append(“forgeeks”)” which changes the actual value of the
string (in main) to “Geeksforgeeks”. This is due to the simple fact that StringBuilder is mutable and hence changes its value.

2. Concat3 : StringBuffer is similar to StringBuilder except one difference that StringBuffer is thread safe, i.e., multiple threads
 can use it without any issue. The thread safety brings a penalty of performance.*/



