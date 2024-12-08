package predicateoperations.com.example.clientsapps;

import java.util.Arrays;
import java.util.List;

public class PredicateBasicOperations1 {

    public static void main(String[] args) {

        // Write a Predicate to check whether a given number is even.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 10, 12, 14, 112, 13, 113, 119);
        System.out.println("Even Numbers");
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

    }


}
