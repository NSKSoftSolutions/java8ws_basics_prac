package org.example.bo;

import predicateoperations.com.example.domain.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class PersonService {

    List<Person> persons = new LinkedList<>();
    boolean isAdded = false;

    public boolean addPerson(Supplier<Person> personSupplier) {

        if (personSupplier.get() != null) {
            System.out.println("Person Object adding to persons list");
            persons.add(personSupplier.get());
            System.out.println("added new Person Object");
            return true;
        } else {
            System.out.println("Person details are not found");
            return false;
        }
    }
}
