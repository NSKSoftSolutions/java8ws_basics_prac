package org.example.client.apps;

import java.util.*;


public class ConcatenateGivenString {

    public static void main(String[] args) {

        String existingString = "Sajjad";
        //write a program to concatenate two string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String you want to add at the end");
        String givenString = scanner.next();
        String newString = existingString.concat(givenString);
        System.out.println("the new String is --" + newString);


    }


}
