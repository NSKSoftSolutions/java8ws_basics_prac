package org.example.client.apps;

import org.example.domain.Email;

public class EmailValidationClientApp {
    public static void main(String[] args) {
        // write a program to check the email is valid or not
        Email email = new Email();
        if (email.validateEmailId("sajjadalikhan.navab@gmail.com")) {
            System.out.println("Email is Validated Successfully");
        } else {
            System.out.println("Please enter the email with @");
        }
        System.out.println("Validating users");
        if (email.validateUser("sajjad@alikhan")) {
            System.out.println("User shouldn't have special Charachter"); 
        } else {
            System.out.println("hurry! valid user name");
        }
    }
}
