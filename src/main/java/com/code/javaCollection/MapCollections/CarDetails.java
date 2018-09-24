package com.code.javaCollection.MapCollections;


/**
 * Created by prem on 5/1/2017.
 */
public class CarDetails implements Comparable<CarDetails> {
    int price;
    String regNo;

    public CarDetails(String regNo) {
        this.regNo = regNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof CarDetails) {
            if (this.regNo.equals(((CarDetails) obj).getRegNo())) {
                return true;
            }
        }
        return false;
    }

//    @Override
//    public int compareTo(CarDetails o) {
//        if (o != null && o instanceof CarDetails) {
//            if (this.price < o.price) {
//                return -1;
//            }
//            if (this.price > o.price) {
//                return 1;
//            }
//        }
//        return 0;
//    }

    @Override
    public int compareTo(CarDetails obj) {
        if (obj != null && obj instanceof CarDetails) {
            if (this.price < obj.price)
                return -1;
            if (this.price > obj.price)
                return 1;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        return this.regNo.hashCode();
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "price=" + price +
                ", regNo='" + regNo + '\'' +
                '}';
    }
}
