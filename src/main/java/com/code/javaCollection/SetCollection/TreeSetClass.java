package com.code.javaCollection.SetCollection;


import com.learnII.ArrayListDemo.Car;

/**
 * Created by prem on 5/1/2017.
 */
    /* Unique element
    - why TreeSet if we has hashset, linkedhashset
     - hashSet : unsorted , unordered set
     - LinkedHashSet: ordered but unsorted
     - TreeSet : ordered and sorted which implements sortedSet and navigableSet
     - headSet : all the element above that element
     - tailSet : return all elm that is after tailset*/

public class TreeSetClass implements Comparable<TreeSetClass> {
    String regNo;
    int price;

    public TreeSetClass(String regNo) {
        this.regNo = regNo;

    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(TreeSetClass o) {
        if (o.getPrice() > this.getPrice())
            return -1;
        else if (o.getPrice() < this.getPrice()) {
            return 1;
        }
        return 0;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            if (regNo != null && this.regNo.equals(((Car) obj).getRegNo())) {
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
        return "TreeSetClass{" +
                "regNo='" + regNo + '\'' +
                ", price=" + price +
                '}';
    }
}
