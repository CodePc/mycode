package com.code.javaCollection.SortingAndCompareInCollection;

/**
 * Created by prem on 5/1/2017.
 */
public class CompareCar implements Comparable<CompareCar> {
    private int price;
    private String regNo;

    CompareCar(int price, String regNo) {
        this.price = price;
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
    public int compareTo(CompareCar o) {
        if (o != null && o instanceof CompareCar) {
            if (this.getPrice() > o.getPrice()) {
                return 1;
            } else if (this.getPrice() < o.getPrice()) {
                return -1;
            }
        }
        return 0;
    }

//    @Override // custom compare
//    public int compareTo(CompareCar o1, CompareCar o2) {
//        if (o1.price > o2.getPrice()) {
//            return -1;
//        } else if (o1.price < o2.price) {
//            return 1;
//        } else return 0;
//    }


    public static void main(String[] args) {
        CompareCar compareCar1 = new CompareCar(1, "Audi01");
        CompareCar compareCar2 = new CompareCar(2, "Audi02");
        System.out.println(compareCar1.compareTo(compareCar2));
    }

    @Override
    public String toString() {
        return "CompareCar{" +
                "price=" + price +
                ", regNo='" + regNo + '\'' +
                '}';
    }
}
