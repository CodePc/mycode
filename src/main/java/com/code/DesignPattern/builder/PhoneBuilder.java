package com.code.DesignPattern.builder;

/**
 * @author prem chand shah on 18-08-2018
 * @project myJava
 */
public class PhoneBuilder {
    private String os;
    private String processor;
    private int ram;
    private long screenSize;
    private int hdd;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreenSize(long screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setHdd(int hdd) {
        this.hdd = hdd;
        return this;
    }

    public Phone build() {
        return new Phone(os, processor, ram, screenSize, hdd);
    }
}
