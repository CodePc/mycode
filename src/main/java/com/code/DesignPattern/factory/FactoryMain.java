package com.code.DesignPattern.factory;

/**
 * @author prem chand shah on 18-08-2018
 * @project myJava
 */
public class FactoryMain {
    public static void main(String[] args) {
        OsFactory osFactory = new OsFactory();
        Os android = osFactory.getInstance("ANDROID");
        Os win = osFactory.getInstance("windows");
        Os ios = osFactory.getInstance("ios");
        android.type();
        win.type();
        ios.type();
    }
}
