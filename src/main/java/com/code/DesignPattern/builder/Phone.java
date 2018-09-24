package com.code.DesignPattern.builder;

/**
 * @author prem chand shah on 18-08-2018
 * @project myJava
 */
public class Phone {
    private String os;
    private String processor;
    private int ram;
    private long screenSize;
    private int hdd;

    public Phone(String os, String processor, int ram, long screenSize, int hdd) {
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.screenSize = screenSize;
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public long getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(long screenSize) {
        this.screenSize = screenSize;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", screenSize=" + screenSize +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
