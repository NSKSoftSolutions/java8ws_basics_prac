package org.example.clients;

import org.example.services.MailServices;

public class MailServiceClientApp {
    public static void main(String[] args) {

        MailServices mailServices = new MailServices();
        String welcomeMailService = mailServices.welcomeMailService("Sajjad ALikhan");
        System.out.println(welcomeMailService);
    }
}
