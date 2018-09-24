package com.code.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;


/**
 * @author prem chand shah on 10-05-2018
 * @project myJava
 */
public class DeserializationTest {
    private HashMap map = new HashMap();

    public static void main(String[] args) {
        Studentinfo si = null;
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (Studentinfo) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(si.name);
        System.out.println(si.rid);
        System.out.println(si.contact);


    }
}


/**
 * Contact field is null because,it was marked as static and as we have discussed earlier static fields does not get serialized.
 NOTE: Static members are never serialized because they are connected to class not object of class.



 transient Keyword
 While serializing an object, if we don't want certain data member of the object to be serialized we can mention it transient.
 transient keyword will prevent that data member from being serialized.
 */