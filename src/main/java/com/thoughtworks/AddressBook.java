package com.thoughtworks;

import java.util.ArrayList;

public class AddressBook {

    Person person;

    public AddressBook(Person person) {
        this.person = person;
    }

    public boolean addPerson() {

        ArrayList<Person> list = new ArrayList<>();
        return list.add(person);
    }
}
