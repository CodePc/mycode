package com.looseCoupling;

/**
 * @author prem chand shah on 16-03-2018
 * @project myJava
 */
public class BubbleSort implements SortingAlgo {

    @Override
    public void sort() {
        System.out.println("This is bubble sort");

    }

    private void extraMethod() {
    }

    public static void main(String[] args) {
        SortingAlgo sortingAlgo = new BubbleSort();
    }
}
