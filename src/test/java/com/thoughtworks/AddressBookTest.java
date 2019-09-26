package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddressBookTest {

    @Test
    void givenPerson_WhenAddPerson_ThenShouldReturnTrue() {
        Address address = new Address("Maharashtra", "Pune", 412202);
        Person person = new Person("pranali", 98877676, address);

        AddressBook addressBook = new AddressBook();

        assertTrue(addressBook.addPerson(person));
    }

    @Test
    void givenNoPersonAddedInAddressBook_WhenRetrieveAddressBookContents_ThenShouldNotReturnAnyPerson() {
        AddressBook addressBook = new AddressBook();

        assertTrue(addressBook.get().isEmpty());
    }

    @Test
    void givenOnePersonAdded_WhenRetrieveAddressBookContents_ThenShouldReturnOnePerson() {
        Address address = new Address("Maharashtra", "Pune", 412202);
        Person person = new Person("pranali", 98877676, address);

        AddressBook addressBook = new AddressBook();
        addressBook.addPerson(person);

        assertEquals(1, addressBook.get().size());
    }

}
