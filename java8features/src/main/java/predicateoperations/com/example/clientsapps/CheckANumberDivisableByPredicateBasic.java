package predicateoperations.com.example.clientsapps;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;


public class CheckANumberDivisableByPredicateBasic {
    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(16);
        numbers.add(17);
        numbers.add(7);
        numbers.add(18);
        numbers.add(21);

        Predicate<Integer> divisableBy3 = CheckANumberDivisableByPredicateBasic::numbersDivisableBy3;
        Predicate<Integer> divisableBy7 = CheckANumberDivisableByPredicateBasic::numbersDivisableBy7;
        Predicate<Integer> composedPredicate = divisableBy3.and(divisableBy7);

        numbers.stream().filter(composedPredicate).forEach(System.out::println);

    }

    private static boolean numbersDivisableBy3(Integer number) {
        return number % 3 == 0;
    }

    private static boolean numbersDivisableBy7(Integer number) {
        return number % 7 == 0;
    }
}