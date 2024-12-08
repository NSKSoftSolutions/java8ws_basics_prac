package predicateoperations;

import predicateoperations.com.example.domain.Person;
import predicateoperations.com.example.services.PersonServiceImpl;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PersonClientApplication {
    static PersonServiceImpl personService;
    static Person person;
    static String name;
    static int age;
    static Predicate<Person> personPredicate;

    public static void main(String[] args) {
        /* variable and reference declarations*/


        /*choose suitable option*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to AP Portal");
        System.out.println("select the service you want access");
        System.out.println("1. Apply for Voter Card");
        System.out.println("2. Apply for PAN Card");
        System.out.println("3. Apply for DOB Certificate ");
        System.out.println("4. Apply for Pension ");
        System.out.println("5. Apply for ElectricityBill Exemption");
        System.out.println("6. Apply for passport");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Welcome to Election Commision of India");
                System.out.println("Enter Your Details to check the Eligiblity");
                person = personBasicDetails(scanner);
                personService = new PersonServiceImpl();
                personPredicate = personService.checkVotingEligibilty();
                if (personPredicate.test(person)) {
                    System.out.println("Ur Eligible to Vote");
                } else {
                    System.out.println("Ur not Eligible to Vote");
                }
                break;
            case 2:
                System.out.println("Apply For PAN Card");
                person = personBasicDetails(scanner);
                personService = new PersonServiceImpl();
                personPredicate = personService.checkPanCardEligibility();
                if (personPredicate.test(person)) {
                    System.out.println("Eligible for Applying PAN Card");
                } else {
                    System.out.println("Try next year");
                }
                break;
            case 3:
                System.out.println("Welcome to DOB Certificaite Site");
                person=personBasicDetails(scanner);
                //personPredicate=personService.applyForDOBCertificate();
                if (personPredicate.test(person)){
                    System.out.println("Applied Successfully");
                }
                break;
            case 4:
                System.out.println("Apply for Pension");
                person = personBasicDetails(scanner);
                personService = new PersonServiceImpl();
                personPredicate = personService.checkPensionEligibility();

                if (personPredicate.test(person)) {
                    System.out.println("Eligible for Pension Programm");
                } else {
                    System.out.println("Not Eligible");
                }
                break;
            case 5:
                System.out.println("Enter Electricity exemption units");
                int units = scanner.nextInt();
                personService = new PersonServiceImpl();
                IntPredicate eligibleUnits = personService.checkEligibleUnits();
                if (eligibleUnits.test(units)) {
                    System.out.println("Eligible for Exemption");
                } else {
                    System.out.println("Exceeded 200 units, Not Eligible");
                }
                break;
        }
    }

    private static Person personBasicDetails(Scanner scanner) {
        int age;
        String name;
        System.out.println("Enter Name");
        name = scanner.next();
        System.out.println("Enter Age");
        age = scanner.nextInt();

        person = new Person(name, age);
        return person;
    }
}
