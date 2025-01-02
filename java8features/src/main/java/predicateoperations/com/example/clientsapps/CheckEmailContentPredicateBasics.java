package predicateoperations.com.example.clientsapps;

import java.util.LinkedList;
import java.util.List;

public class CheckEmailContentPredicateBasics {
    public static void main(String[] args) {

        // Creating a List of email IDs
        List<String> emailList = new LinkedList<>();

        // Adding email IDs to the List
        emailList.add("john.doe@example.com");
        emailList.add("jane.smith@example.org");
        emailList.add("contact@company.com");
        emailList.add("support@service.net");
        emailList.add("info@domain.edu");


        emailList.stream().filter(email -> email.contains("@")).forEach(System.out::println);


    }
}
