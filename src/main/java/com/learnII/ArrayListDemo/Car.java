package com.learnII.ArrayListDemo;

/**
 * Created by Prem Chand on 12/25/2016.
 */
public class Car {
    String regNo;
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  Car(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNo='" + regNo + '\'' +
                ", price=" + price +
                '}';
    }
}

