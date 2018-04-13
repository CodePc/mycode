package com.learnII;

import com.learnI.Employee;

/**
 * Created by Prem Chand on 9/21/2016.
 */
public class SalarySuperKeywordDemo extends Employee {
    String name,add;
    int num;

private double salary; // Annual salary

    public SalarySuperKeywordDemo(String name, String address, int number, double salary) {
        super(name, address, number); // super() keyword can be used within constructor to call the constructor of super class.
        setSalary(salary);        //^ if we want to call constructor of super call we have to use super in constructor of child class
                                //keyword is used to call immediate parent.
    }


    public void mailCheck() {
        System.out.println("Within mailCheck of SalarySuperKeywordDemo class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
//        super.mailCheck(); // we can call super to use method of immediate super class
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}