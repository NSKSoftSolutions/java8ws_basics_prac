package predicateoperations.com.example.clientsapps;

import java.util.LinkedList;
import java.util.List;

public class CheckANumberMultipleOfPredicateBasic {
    public static void main(String[] args) {

        // Write a Predicate to check whether a number is a multiple of 10.
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(130);
        numbers.add(12);
        numbers.add(13);

        System.out.println("check whether the given number is multiple of 10");
        numbers.stream().filter(CheckANumberMultipleOfPredicateBasic::checkANumberMultiplyOf).forEach(System.out::println);

    }

    private static boolean checkANumberMultiplyOf(int number) {
        if (number % 10 == 0) {
            System.out.println("the Given Number -- " + number + " -- is multiple of 10 ");
            return true;
        } else {
            System.out.println("The Given Number -- " + number + " -- is not multiply of 10");
            return false;
        }
    }
}
