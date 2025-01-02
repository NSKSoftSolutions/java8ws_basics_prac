package org.example.client.apps;

public class ConvertCharArrayToStringClientApp {
    public static void main(String[] args) {
        char[] ch = {'T', 'E', 'M', 'P' };
        String convertedString = String.copyValueOf(ch);
        System.out.println(convertedString);
    }
}
