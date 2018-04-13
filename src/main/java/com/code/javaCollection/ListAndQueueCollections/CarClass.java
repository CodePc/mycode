package com.code.javaCollection.ListAndQueueCollections;

/**
 * Created by prem on 4/30/2017.
 */
public class CarClass {
    private String regNo;

    public CarClass(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }


    // VVVI
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof CarClass) {
            String regNo = ((CarClass) obj).getRegNo();
            if (regNo != null && regNo.equals(this.regNo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.regNo.hashCode();
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "regNo=" + regNo +
                '}';
    }
}

