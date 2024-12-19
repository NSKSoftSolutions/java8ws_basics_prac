package org.example;

import org.example.bo.PredicateService;
import predicateoperations.com.example.domain.Person;
import predicateoperations.com.example.domain.Product;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateClientMain {
    public static void main(String[] args) {

        PredicateService predicateService = new PredicateService();

        // List only even numbers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
        Predicate<Integer> predicate = (number) -> (number % 2 == 0);
        predicateService.isEven(numbers, predicate).forEach(System.out::println);

        // list names that starts with S
        List<String> names = Arrays.asList("Sajjad", "Sadakhat", "Sufiyan", "Ayan", "Akif", "Hayatulla");
        Predicate<String> stringPrediate = (name) -> name.startsWith("S");
        List<String> startsWithS = predicateService.listNamesStartWithS(names, stringPrediate);
        startsWithS.forEach(System.out::println);

        //ADD The product to the List
        Product product1 = new Product(1, "Iphone 16", 124.99);
        Product product2 = new Product(2, "Iphone 16", 114.90);
        Product product3 = new Product(3, "Iphone 16", 134.99);
        Product product4 = new Product(4, "Iphone 16", 144.99);

        List<Product> products = new LinkedList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);



    }


}
