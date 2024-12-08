package predicateoperations.com.example.clientsapps;

import java.util.*;

public class FilterPositiveNumbersPredicateBasics {

    public static void main(String[] args) {

        // 3. filter the +ve numbers only
        // Creating a List of integers
        List<Integer> numberList = new ArrayList<>();

        // Adding positive and negative numbers to the List
        numberList.add(10);
        numberList.add(-5);
        numberList.add(20);
        numberList.add(-15);
        numberList.add(30);
        numberList.add(-25);

        //numberList.stream().filter(number -> number > 0).forEach(System.out::println);
        numberList.stream().filter(FilterPositiveNumbersPredicateBasics::filterPosNumbers).forEach(System.out::println);
    }

    private static boolean filterPosNumbers(Integer giveNumber) {
        return giveNumber > 0;
    }
}
