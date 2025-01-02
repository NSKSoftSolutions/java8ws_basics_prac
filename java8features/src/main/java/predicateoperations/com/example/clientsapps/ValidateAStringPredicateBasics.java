package predicateoperations.com.example.clientsapps;

import java.util.function.Predicate;

public class ValidateAStringPredicateBasics {
    public static void main(String[] args) {

        // Validate a string to ensure it starts with "Hello" and ends with "World".
        String s1 = "Hello world";

        Predicate<String> p1 = (str) -> str.startsWith("Hello") && str.endsWith("world");
        boolean test = p1.test(s1);
        if (test) {
            System.out.println("The Given String Start With 'Hello' and EndsWith 'Welcome' ");
        }


    }
}
