package com.code.DesignPattern.builder;

/**
 * @author prem chand shah on 18-08-2018
 * @project myJava
 */
public class BuildPhoneObject {
    public static void main(String[] args) {
        /**
         * Value we don't set get's default value so we don't need to pass all the argument to construct an object which has constructor
         * with hug number of args*/

        Phone phone = new PhoneBuilder()
                .setHdd(23)
                .setHdd(43)
                .setOs("iOS")
                .setProcessor("i7")
                .setRam(4)
                .build();
        System.out.println(phone);
    }
}
