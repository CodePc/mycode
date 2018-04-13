package com.learnI;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by prem on 4/21/2017.
 */
public class ExceptionHandling {
    public void handleThis() {
        try {
            FileReader fileReader = new FileReader("prem.text");
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } finally { // finally will always run even if exception occur or not
            System.out.println("This program will run");
        }
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.handleThis();
    }
}
