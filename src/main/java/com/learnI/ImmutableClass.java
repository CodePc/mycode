package com.learnI;

/**
 * Created by prem on 4/18/2017.
 */


/*Immutable class means that once an object is created, we cannot change its content. In Java, all the wrapper classes
(like String, Boolean, Byte, Short) and String class is immutable. We can create our own immutable class as well.*/

public final class ImmutableClass {
    final String name;
    final int regNo;
    final String add;

    public ImmutableClass(String name, int regNo, String add) {
        this.name = name;
        this.regNo = regNo;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

}

final class imm {
    final String ss;
    final int in;

    public imm(String ss, int in) {
        this.ss = ss;
        this.in = in;
    }

    public String getSs() {
        return this.ss;
    }

    public int getIn() {
        return this.in;
    }
}

// Driver class
class Test {
    public static void main(String args[]) {
        ImmutableClass s = new ImmutableClass("ABC", 101, "prem");
        System.out.println(s.name);
        System.out.println(s.regNo);
        // Uncommenting below line causes error
//        s.regNo = 102;
    }
}
