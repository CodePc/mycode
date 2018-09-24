package com.code.DesignPattern.solid;

/**
 * @author prem chand shah on 09-05-2018
 * @project myJava
 */
public class D_DependencyInversionPrinciple_Bad {
    class Worker {

        public void work() {

            // ....working

        }

    }



    class Manager {

        Worker worker;



        public void setWorker(Worker w) {
            worker = w;
        }

        public void manage() {
            worker.work();
        }
    }

    class SuperWorker {
        public void work() {
            //.... working much more
        }
    }
}
