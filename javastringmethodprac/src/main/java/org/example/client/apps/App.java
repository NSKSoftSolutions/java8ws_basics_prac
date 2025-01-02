package org.example.client.apps;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Imagine ur creating a username validation system and you want to extract the first Letter of the username
        //  to validate whether it is a valid string charchter or not.
        //
        //  eg: it should be a letter not a number or a symbol
        //

        String username = "James Anderson";

        char firstChar = username.charAt(0);

        if (Character.isLetter(firstChar)) {
            System.out.println("Valid Username --" + username);
        } else {
            System.out.println("Invalid Username --" + username);
        }


    }
}
