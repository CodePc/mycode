package com.code.DesignPattern.solid;

/**
 * @author prem chand shah on 09-05-2018
 * @project myJava
 * <p>
 * This is concept of dependency injection
 */

/**
 * This is concept of dependency injection
 */

/**In a bad design the high level class uses directly and depends heavily on the low level classes.
 *  In such a case if we want to change the design to direct the output to a new FileWriter class we have to make changes in the Copy class.
 *  (Let's assume that it is a very complex class, with a lot of logic and really hard to test).

 In order to avoid such problems we can introduce an abstraction layer between high level classes and low level classes.
 Since the high level modules contain the complex logic they should not depend on the low level modules so the new abstraction layer should not be created based on low level modules.
 Low level modules are to be created based on the abstraction layer.

 According to this principle the way of designing a class structure is to start from high level modules to the low level modules:
 High Level Classes --> Abstraction Layer --> Low Level Classes



 Conclusion
 When this principle is applied it means the high level classes are not working directly with low level classes,
 they are using interfaces as an abstract layer. In this case instantiation of new low level objects inside the high level classes(if necessary) can not be done using the operator new.
 Instead, some of the Creational design patterns can be used, such as Factory Method, Abstract Factory, Prototype.

 The Template Design Pattern is an example where the DIP principle is applied.
 Of course, using this principle implies an increased effort, will result in more classes and interfaces to maintain,
 in a few words in more complex code, but more flexible. This principle should not be applied blindly for every class or every module.
 If we have a class functionality that is more likely to remain unchanged in the future there is not need to apply this principle.
 */
public class D_DependencyInversionPrinciple_Good {
    // Dependency Inversion Principle - Good example
    interface IWorker {
        public void work();
    }

    class Worker implements IWorker {
        public void work() {
            // ....working
        }
    }

    class SuperWorker implements IWorker {
        public void work() {
            //.... working much more
        }
    }

    class Manager {
        IWorker worker;

        public void setWorker(IWorker w) {
            worker = w;
        }

        public void manage() {
            worker.work();
        }
    }

    public void run() {
        Manager manager = new Manager();
        SuperWorker superWorker = new SuperWorker();
        manager.setWorker(superWorker);

    }
}
