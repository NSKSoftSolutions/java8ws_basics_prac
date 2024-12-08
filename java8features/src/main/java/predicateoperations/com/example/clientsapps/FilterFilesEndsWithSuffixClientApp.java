package predicateoperations.com.example.clientsapps;

import predicateoperations.com.example.services.PersonServiceImpl;

import java.io.*;
import java.util.Scanner;
import java.util.function.Predicate;

public class FilterFilesEndsWithSuffixClientApp {
    public static void main(String[] args) {

        PersonServiceImpl personService = new PersonServiceImpl();
        Predicate<File> p = personService.fileEndWithSuffix();
        System.out.println("Enter the valid file ");
        if (p.test(new File(new Scanner(System.in).next()))) {
            System.out.println("Matched");
        } else {
            System.out.println("we will support only pdf formats");
        }


    }

}
