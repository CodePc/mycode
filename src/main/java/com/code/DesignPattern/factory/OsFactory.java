package com.code.DesignPattern.factory;

/**
 * @author prem chand shah on 18-08-2018
 * @project myJava
 */
public class OsFactory {
    public Os getInstance(String os) {
        if (os.equalsIgnoreCase("android"))
            return new Android();
        else if (os.equalsIgnoreCase("ios")) {
            return new IOS();
        } else
            return new Windows();
    }
}
