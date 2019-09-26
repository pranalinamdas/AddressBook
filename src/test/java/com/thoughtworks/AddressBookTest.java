package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    @Test
    void givenPerson_WhenAddPerson_ThenShouldReturnTrue() {
        Address address = new Address("Maharashtra", "Pune", 412202);
        Person person = new Person("pranali", 98877676, address);

        AddressBook execute = new AddressBook(person);

        Assertions.assertTrue(execute.addPerson());
    }

}
