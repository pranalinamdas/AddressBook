package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private ArrayList<Person> people;

    public AddressBook() {
        people = new ArrayList<>();
    }

    public boolean addPerson(Person person) {

        people.add(person);
        return true;
    }

    public List<Person> get() {
        return people;
    }
}
