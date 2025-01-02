package predicateoperations.com.example.clientsapps;

import java.util.*;
import java.lang.*;
import java.util.function.Predicate;

public class MatchTheLetterEPredicateBasic {
    public static void main(String[] args) {

        Predicate<String> containsE = MatchTheLetterEPredicateBasic::isContainE;
        Predicate<String> containsLength8 = MatchTheLetterEPredicateBasic::isLengthGreaterThan8;
        Predicate<String> composedPreicate = containsE.and(containsLength8);

        // Validate a string to ensure it contains the letter 'e' and its length is greater than 8.
        List<String> froots = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        froots.stream().filter(composedPreicate).forEach(System.out::println);

    }

    private static boolean isContainE(String froot) {
        return froot.contains("e");
    }

    private static boolean isLengthGreaterThan8(String froot) {
        return froot.length() > 8;
    }


}
