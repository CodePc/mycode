package com.code.serializationAndDeserialization;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.RandomAccess;

/**
 * @author prem chand shah on 10-05-2018
 * @project myJava
 */
public class Studentinfo implements Cloneable, Serializable, Remote, RandomAccess {
    String name;
    int rid;
    static String contact;

    Studentinfo(String n, int r, String c) {
        this.name = n;
        this.rid = r;
        this.contact = c;
    }
}
