package com.learnII;

/**
 * @author prem chand shah on 02-05-2018
 * @project myJava
 */

/**
 * Java toString() method

 If you want to represent any object as a string, toString() method comes into existence.

 The toString() method returns the string representation of the object.

 If you print any object, java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depends on your implementation.

 Advantage of Java toString() method

 By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.

 */
public class OVERRIDER_TOSTRING {
    public String name;
    private String add;

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public OVERRIDER_TOSTRING(String name, String add) {
        this.name = name;
        this.add = add;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" + " add: " + add;
    }

    public static void main(String[] args) {
        OVERRIDER_TOSTRING OVERRIDERTostring1 = new OVERRIDER_TOSTRING("prem", "Bangalore");
        OVERRIDER_TOSTRING OVERRIDERTostring2 = new OVERRIDER_TOSTRING("jay", "Bangalore");


        System.out.println(OVERRIDERTostring1);

        System.out.println(OVERRIDERTostring2);
    }
}
