package org.example.client.apps;

public class ConvertingCharArrayToStringClientApp {
    public static void main(String[] args) {

        char[] chars={'h','e','l','l','o'};
        String newString=String.copyValueOf(chars);
        System.out.println(newString);

    }
}
