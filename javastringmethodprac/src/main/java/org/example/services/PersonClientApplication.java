package org.example.services;

import org.example.domain.Person;

public class PersonClientApplication {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Sajjad", 32, "sajjad@gmail.com");
        Person person2 = new Person(1, "Sajjad", 32, "sajjad@gmail.com");
        if (person1.equals(person2)) {
            System.out.println("Both Object Contents are Equal -- " + person1.getName() + "--- and --- " + person2.getName() + "--are Equal");
        } else {
            System.out.println("Both Object Contents are not Equal -- " + person1.getName() + "and" + person2.getName() + "are Equal");
        }

    }
}
