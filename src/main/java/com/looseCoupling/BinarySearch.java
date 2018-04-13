package com.looseCoupling;

/**
 * @author prem chand shah on 16-03-2018
 * @project myJava
 */
public class BinarySearch {
    public static void main(String[] args) {
        BianrySearchImpl bianrySearch = new BianrySearchImpl(new QuickSort());
        bianrySearch.binarySort();
    }
}
