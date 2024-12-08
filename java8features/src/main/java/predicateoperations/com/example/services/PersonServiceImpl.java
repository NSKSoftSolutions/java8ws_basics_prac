package predicateoperations.com.example.services;

import predicateoperations.com.example.domain.Person;

import java.io.File;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PersonServiceImpl {

    public Predicate<Person> checkVotingEligibilty() {
        return person1 -> person1.getAge() > 19 ? true : false;
    }

    public Predicate<Person> checkPanCardEligibility() {

        return person1 -> person1.getAge() > 21 ? true : false;
    }

    public Predicate<Person> checkPensionEligibility() {
        return person1 -> person1.getAge() > 55 ? true : false;
    }

    public IntPredicate checkEligibleUnits() {
        return units -> units <= 200 ? true : false;
    }

    public Predicate<String> filterPredicateByPrefix() {
        return prefix -> prefix.startsWith("S");
    }

    public Predicate<File> fileEndWithSuffix() {
        return file -> file.getName().endsWith(".pdf");
    }
}
