package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private ArrayList<Person> people;

    public AddressBook() {
        this.people = new ArrayList<Person>();
    }

    public boolean addPerson(Person person) {
        return true;
    }

    public List<Person> get() {
        return new ArrayList<>();
    }
}
