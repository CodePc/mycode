package com.learnI;

/**
 * Created by prem on 4/16/2017.
 */
public class ExtendAbstractClass extends AbstractClass {
    @Override
    public void abstractMethodCannotHaveImplementation() {
        System.out.println("We have extended a abstract class so here in subclass we have to override " +
                "all the abstract methods in abstract class");
    }

    public void abstractMethodCannotHaveImplementationTwo() {
        System.out.println("Implementing abstract class in subclass again" +
                "default access modifier in super class but public in subclass" +
                "so in suclass we cannot have weeker access modifier for abstract class as compare to super class");
    }

    public static void main(String[] args) {
        ExtendAbstractClass extendAbstractClass = new ExtendAbstractClass(); // constructor of abstract class is invoked when object of subclass is created, there is now
        System.out.println("Above result is from constructor of abstract class extended here");
        extendAbstractClass.nonAbstractMethod();
    }
}
