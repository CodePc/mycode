package com.code.MultiThreading;

/**
 * Created by prem on 5/13/2017.
 */
public class Download implements Runnable {
    private String url;

    public Download(String url) {
        this.url = url;
    }

    public void run() {
        FileDownLoader fd = new FileDownLoader();
        fd.downloadMethod();
    }

    public static void main(String[] args) {
        Download d = new Download("https//:www.google.com");
        Thread t1 = new Thread(); // default constructor
        Thread t2 = new Thread(d); // target thread, pass the reference of object which has run method and implements runnable
        t1.start();
        new Thread(d,"prem"); // thread with name


    }
}
