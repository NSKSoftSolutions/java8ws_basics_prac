package org.example.client.apps;

import org.example.domain.Person;

public class PersonClientApplication {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Sajjad Alikhan Navab", 26, "sajjad@gmail.com");
        Person person2 = new Person(1, "Sajjad Navab", 26, "sajjad@gmail.com");

        if (person1.equals(person2)) {
            System.out.println("Done the Content Comparision, both " + person1.getName() + "and" + person2.getName()  +"both are same");
        } else {
            System.out.println("Done the Content Comparision, both " + person1.getName() + "and"  + person2.getName()  +"both aren't same");
        }


    }
}
