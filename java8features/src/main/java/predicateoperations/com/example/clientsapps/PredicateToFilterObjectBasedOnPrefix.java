package predicateoperations.com.example.clientsapps;

import predicateoperations.com.example.services.PersonServiceImpl;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateToFilterObjectBasedOnPrefix {
    public static void main(String[] args) {

        PersonServiceImpl personService = new PersonServiceImpl();
        Predicate<String> p = personService.filterPredicateByPrefix();
        System.out.println("Enter a name");
        if (p.test(new Scanner(System.in).next())) {
            System.out.println("Matched");
        } else {
            System.out.println("Not Matched");
        }

    }

}
