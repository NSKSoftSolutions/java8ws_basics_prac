package org.example.client.apps;

import org.example.methods.CharAtMethodPracticeExample1;

public class CharAtMethodClientApplication {

    public static void main(String[] args) {
        int indexNumber = 2;
        String strValue = "HELLO DEVELOPER";
        CharAtMethodPracticeExample1 charAtMethodPracticeExample1 = new CharAtMethodPracticeExample1();

        char resultantChar = charAtMethodPracticeExample1.findCharAtGivenIndex(indexNumber, strValue);
        System.out.println("Given String -- " + strValue);
        System.out.println("the Charchter at the given index " + indexNumber + " -- is --> " + resultantChar);
    }

}
