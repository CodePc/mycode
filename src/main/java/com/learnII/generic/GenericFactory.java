package com.learnII.generic;


import com.code.javaCollection.ListAndQueueCollections.CarClass;
import com.learnII.ArrayListDemo.Car;

import java.util.*;

/**
 * @author prem chand shah on 14-06-2018
 * @project myJava
 */
public class GenericFactory<T> {
    Class theClass = null;

    public void GenericFactory(Class theClass) {
        this.theClass = theClass;
    }

    public T createInstance() throws IllegalAccessException, InstantiationException {
        return (T) this.theClass.newInstance();
    }

    public static <T> T addAndReturn(T element, Collection<T> collection) {
        Collection<T> c = null;
        c.add(element);
        collection.add(element);
        return element;
    }

    public void callGenericMethod() {
        String stringElement = "stringElement";
        List<String> stringList = new ArrayList<String>();
        String theElement = addAndReturn(stringElement, stringList);


        Integer integerElement = new Integer(123);
        List<Integer> integerList = new ArrayList<Integer>();
        Integer theElementInt = addAndReturn(integerElement, integerList);
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GenericFactory<CarClass> carClassGenericFactory = new GenericFactory<>();
        CarClass cc = carClassGenericFactory.createInstance();
        cc.getRegNo();
    }
}
