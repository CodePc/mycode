package com.looseCoupling;

/**
 * @author prem chand shah on 16-03-2018
 * @project myJava
 */
public class BianrySearchImpl {

    private SortingAlgo sortingAlgo; // this is interface

    public BianrySearchImpl(SortingAlgo sortingAlgo) {
        this.sortingAlgo = sortingAlgo; // it will take all the class which has implemented sortingAlso interface

    }

    public void binarySort() {
        sortingAlgo.sort(); // we can call all the method of interface here
    }
}
