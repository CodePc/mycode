package com.learnII;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * Created by Prem Chand on 9/25/2016.
 *
 *
 */
public class ExceptionHandling {
    public void fileAccess(){
        try {
            FileReader fileReader =  new FileReader("test");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Runs for sure");
        }
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.fileAccess();
    }
}
