package com.code.serializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author prem chand shah on 10-05-2018
 * @project myJava
 */
public class Test {
    public static void main(String[] args) {
        try {
            Studentinfo si = new Studentinfo("Abhi", 104, "110044");
            FileOutputStream fos = new FileOutputStream("/tmp/employee.serr");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
