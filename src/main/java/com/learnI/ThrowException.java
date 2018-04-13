package com.learnI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by prem on 4/21/2017.
 */
public class ThrowException {
    // if exception is not handled than method can declare with throw clause
    // when method is marked throw calling method have to handle the exception or declare to  throw same
    public void throwException() throws FileNotFoundException {
        FileReader fileReader = new FileReader("prem.text");
        System.out.println("exception is thrown");
    }

    public void callingMethodThrows() throws FileNotFoundException {
        throwException();
    }

    public void callingMethodHandle() {
        try {
            callingMethodThrows();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public void objChainingOne() {
        System.out.println("asd");
    }

    public void objChainingTwo() {
        System.out.println("sadas");
    }

    public void objChainingThree() {
    }

    public void objChainingFour() {
    }

    public static void main(String[] args) {
        ThrowException throwException = new ThrowException();
        throwException.callingMethodHandle();
//        throwException.callingMethodThrows(); // because this method throws and is not handled
    }
}
