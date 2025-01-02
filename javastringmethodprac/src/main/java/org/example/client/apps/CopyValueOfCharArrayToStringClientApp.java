package org.example.client.apps;

import java.util.*;

public class CopyValueOfCharArrayToStringClientApp {
    public static void main(String[] args) {
        char[] data = {'h', 'i', 'd', 'e', 'v', 'e', 'l', 'o', 'p', 'e', 'r' };
        System.out.println("Enter the Index Number, from where you want to start");
        Scanner scanner = new Scanner(System.in);
        int offSetValue = scanner.nextInt();
        int length = data.length - offSetValue;
        System.out.println("The Length is --" + length);
        String subString = String.copyValueOf(data, offSetValue, length);
        System.out.println("subset of given charArray converted to --" + subString);
    }
}