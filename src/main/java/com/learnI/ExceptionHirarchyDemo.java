package com.learnI;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by prem on 4/21/2017.
 */
public class ExceptionHirarchyDemo {
    public void arithmetic(double a, double b) {
        try {
            double c = a / b;
            FileReader fileReader = new FileReader("Kishan");
            // when we have multiple try block than narrow exception should be caught 1st and broader ones later because broader class can
            // refer all other exception and thus catch block will never run for subclass exceptions
            System.out.println("This will never run"); // once the exception occurs any other line after that will not execute
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("This is super class of all the exception ");
        } finally {
            System.out.println("invalid inputs");
        }
    }
}
