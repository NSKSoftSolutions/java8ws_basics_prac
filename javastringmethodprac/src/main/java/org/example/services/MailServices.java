package org.example.services;

public class MailServices {

    public final static String DEFAULT_MESSAGE = "Welcome, to Mail Services, Mr/Miss %s";

    public String welcomeMailService(String userName) {
        return String.format(MailServices.DEFAULT_MESSAGE, userName);
    }
}
