package com.code;

/**
 * Created by prem on 5/19/2017.
 */

/*Restricts the instantiation of class to only one object
-- Benefits------
>> Avoid many instance of same class to be created
>> Lazy instantiation
   >> Delay the instantiation of an object un till it is required for first time
   >> Create obj of class when ever it is required
   >> it allows you to create a single instance
- Creating may instance of the object will create a performance issue lots of gc

How to create
 >> Define private static property that creates an instance of class
 >> private/protected constructor
 >> Define static access function
 >> only use accessor function to call singleton class
-
* */
public class SingletonClass {
    private static SingletonClass singletonClassInstance = new SingletonClass();
    int i;

    private SingletonClass() {

    }

    public static SingletonClass getSingletonClassInstance() {
        return singletonClassInstance;
    }

    public void showMessage() {
        System.out.println("This is singleton class");
    }


    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getSingletonClassInstance();
        SingletonClass singletonClass1 = SingletonClass.getSingletonClassInstance();
        singletonClass1.showMessage();

        SingletonClass.getSingletonClassInstance().showMessage();

        System.out.println(singletonClass.i + "and" + singletonClass1.i);
        System.out.println(singletonClass instanceof SingletonClass);
        System.out.println(singletonClass1 instanceof SingletonClass);
        System.out.println(singletonClass.equals(singletonClass1));
    }
}
