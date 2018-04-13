package com.learnII;

import com.learnII.ArrayListDemo.Car;

/**
 * Created by Prem Chand on 9/22/2016.
 * Interface doesn't have any method implementation all the methods in interface is abstract and public
 * any filed declared should be public final and static
 * And if we don't declare it as public,final and static it will by default be declared so most of the time any file in interface
 * is declared as CONSTANT .
 * why do we need interface ?
 * class can extend any number of interfaces
 */
/*
public interface car; // this is interface
public interface truck; // this interface
public  class vehicle{} // this is concrete class
public class Demo extends vehicle implements car,truck{} // here Demo class has to implement all the abstract class of all interface
- Both concrete and abstract class can implements interface
-when class implements interface it makes IS-A relationship with interface
-any number of interface can be implemented by abstract and concrete class
C:\MyStuff\javaCourse\Interface.png
* */
public interface InterfaceDemo {
    int age = 50;

    public abstract void methodI();

    public void methodII();
}

class InfClass extends EyeTreatment implements InterfaceDemo {
    public void methodI() {
        System.out.println("Implantation of all the call of interface with this class is implementing  ");
    }

    @Override
    public void methodII() {

    }
}

abstract class premAbClass {
    public void m1() {
    }

    public abstract void m2();
}

class exrtends extends premAbClass {
    public void m2() {

    }

    public void m1() {
        super.m1();
    }
}