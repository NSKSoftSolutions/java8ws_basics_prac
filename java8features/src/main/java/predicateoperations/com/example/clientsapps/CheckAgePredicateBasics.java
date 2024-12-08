package predicateoperations.com.example.clientsapps;

import java.util.LinkedList;
import java.util.List;

public class CheckAgePredicateBasics {
    public static void main(String[] args) {

        List<Integer> ages = new LinkedList<>();
        ages.add(19);
        ages.add(1);
        ages.add(9);
        ages.add(29);
        ages.add(39);
        ages.add(49);
        ages.add(59);
        ages.add(69);
        ages.add(79);
        ages.add(99);

        ages.stream().filter(CheckAgePredicateBasics::checkAgeEligiblity).forEach(System.out::println);


    }

    private static boolean checkAgeEligiblity(Integer age) {
        if (age > 18) {
            System.out.println("Ur are an Adult Now ");
            return true;
        } else {
            System.out.println("Ur not Adult");
            return false;
        }
    }
}
