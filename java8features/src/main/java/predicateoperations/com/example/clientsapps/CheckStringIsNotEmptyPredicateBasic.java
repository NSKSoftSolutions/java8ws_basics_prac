package predicateoperations.com.example.clientsapps;

import java.util.*;

public class CheckStringIsNotEmptyPredicateBasic {
    // 2. Write a Predicate to check if a string is not empty.
    public static void main(String[] args) {

        // Creating a List of Strings
        List<String> stringList = new ArrayList<>();

        // Adding strings to the List
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");
        stringList.add("");


        stringList.stream().filter(CheckStringIsNotEmptyPredicateBasic::checkIfStringNotEmpty).forEach(System.out::println);


    }

    private static boolean checkIfStringNotEmpty(String s) {
        if (!(s.isEmpty())) {
            System.out.println("given String is not Empty -- " + s);
            return true;
        } else {
            System.out.println("The Given String empty -- " + s);
            return false;
        }

    }
}
