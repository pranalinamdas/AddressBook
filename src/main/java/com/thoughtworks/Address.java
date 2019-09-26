package com.thoughtworks;

public class Address {

    protected String state;
    private String city;
    private int zipCode;

    public Address(String state, String city, int zipCode) {
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
    }
}
