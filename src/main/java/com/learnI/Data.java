package com.learnI;

import java.util.*;
import java.text.*;

/**
 * Created by SuperClassII Chand on 6/10/2016.
 */
public class Data{
    public static void main(String args[]) {

        Date dNow = new Date( );
        SimpleDateFormat ft;
        ft = new SimpleDateFormat (" MMMMM dd','yyy hh:mm:ss ");

        System.out.println("Current Date: " + ft.format(dNow));
    }
}
