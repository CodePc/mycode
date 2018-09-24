package com.code.javaCollection.ListAndQueueCollections;

import java.util.Objects;

/**
 * Created by prem on 4/30/2017.
 */
public class CarClass implements Comparable {
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


//    // VVVI
//    @Override
//    public boolean equals(Object obj) {
//        if (obj != null && obj instanceof CarClass) {
//            String regNo = ((CarClass) obj).getRegNo();
//            if (regNo != null && regNo.equals(this.regNo)) {
//                return true;
//            }
//        }
//        return false;
//    }


//
//    @Override
//    public int hashCode() {
//        return this.regNo.hashCode();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CarClass carClass = (CarClass) o;
        return Objects.equals(regNo, carClass.regNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(regNo);
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "regNo=" + regNo +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

