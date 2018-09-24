package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prem chand shah on 26-08-2018
 * @project myJava
 */
public class CommonUtils {

    private static List<String> list = new ArrayList<>();
    private static List<String> nullList = null;

    public static <T> T checkNotNull(T object, String message) throws NullPointerException {
        if (object.equals(null)) {
            throw new NullPointerException(message);
        } else {
            return object;
        }
    }

    public static void main(String[] args) {
        checkNotNull(list, "this is message");
        checkNotNull(nullList,"null list");
    }
}
