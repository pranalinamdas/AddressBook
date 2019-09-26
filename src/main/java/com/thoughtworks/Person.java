package com.thoughtworks;

public class Person {

    private final String name;
    private long phNo;
    Address address;

    public Person(String name, long phNo, Address address) {
        this.name = name;
        this.phNo = phNo;
        this.address = address;
    }
}
