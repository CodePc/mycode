package com.code.DesignPattern.solid;

/**
 * @author prem chand shah on 10-05-2018
 * @project myJava
 */

/**
 * The Interface Segregation Principle states that clients should not be forced to implement interfaces they don't use.
 * Instead of one fat interface many small interfaces are preferred based on groups of methods, each one serving one submodule.
 * >> Clients should not be forced to depend upon interfaces that they don't use.
 * Below is an example which violates the Interface Segregation Principle. We have a Manager class which represent the person which manages the workers.
 * And we have 2 types of workers some average and some very efficient workers. Both types of workers works and they need a daily launch break to eat. But now some robots came in the company they work as well ,
 * but they don't eat so they don't need a launch break. One on side the new Robot class need to implement the IWorker interface because robots works. On the other side, the don't have to implement it because they don't eat.

 This is why in this case the IWorker is considered a polluted interface.

 If we keep the present design, the new Robot class is forced to implement the eat method. We can write a dummy class which does nothing(let's say a launch break of 1 second daily),
 and can have undesired effects in the application(For example the reports seen by managers will report more lunches taken than the number of people).

 According to the Interface Segregation Principle, a flexible design will not have polluted interfaces. In our case the IWorker interface should be split in 2 different interfaces.
 * */
public class I_Interface_Segregation_Principle_Bad {

    // interface segregation principle - bad example
    interface IWorker {
        public void work();
        public void eat();
    }

    class Worker implements IWorker{
        public void work() {
            // ....working
        }
        public void eat() {
            // ...... eating in launch break
        }
    }

    class SuperWorker implements IWorker{
        public void work() {
            //.... working much more
        }

        public void eat() {
            //.... eating in launch break
        }
    }

    class Manager {
        IWorker worker;

        public void setWorker(IWorker w) {
            worker=w;
        }

        public void manage() {
            worker.work();
        }
    }
}
