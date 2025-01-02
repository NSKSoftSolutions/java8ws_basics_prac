package predicateoperations.com.example.clientsapps;

import java.util.LinkedList;
import java.util.List;

public class CheckStringLengthPredicateBasics {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Adam");
        names.add("Hawa");
        names.add("Musa");
        names.add("Isa");
        names.add("Noah");
        names.add("Prophet Mohammad");

        names.stream().filter(CheckStringLengthPredicateBasics::checkStringLength).forEach(System.out::println);


    }

    private static boolean checkStringLength(String prophets) {
        if (prophets.length() > 5) {
            System.out.println("Allah sent Prophet, Our Beloved Prophet is -- " + prophets + " SAW ");
            return true;
        } else {
            System.out.println("Waiting for Allah's to send prophet");
            return false;
        }
    }
}
