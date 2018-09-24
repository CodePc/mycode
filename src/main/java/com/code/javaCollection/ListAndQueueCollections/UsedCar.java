package com.code.javaCollection.ListAndQueueCollections;

/**
 * Created by prem on 4/19/2017.
 */
public class UsedCar {
    String regNo;

    UsedCar(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    @Override
    public boolean equals(Object oj) {
        if (oj != null && oj instanceof UsedCar) {
            if (getRegNo() != null && getRegNo().equals(this.regNo))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return regNo.hashCode();
    }
}
