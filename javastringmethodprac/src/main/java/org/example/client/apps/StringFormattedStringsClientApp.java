package org.example.client.apps;

public class StringFormattedStringsClientApp {
    public static void main(String[] args) {

        String name = "Sajjad";
        int age = 32;

        String formattedString = String.format("name: %s"   +   "and Age is %d", name, age);
        System.out.println("formattedString is --" + formattedString);

    }
}
