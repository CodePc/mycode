package com.code.javaCollection.MapCollections;

import java.util.Random;

/**
 * Created by prem on 5/1/2017.
 */
public class CarOwner {
    private String ownerName;

    public CarOwner(String ownerName) {
        this.ownerName = ownerName;
    }

    public CarOwner() {
        final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int n = alpha.length();

        Random r = new Random();
        StringBuffer name = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            name.append(alpha.charAt(r.nextInt(n)));
        }
        ownerName = name.toString();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "CarOwner{" +
                "ownerName='" + ownerName + '\'' +
                '}';
    }
}
