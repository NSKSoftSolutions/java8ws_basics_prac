package org.example.client.apps;

import java.util.Arrays;

public class Compre2StringsClientApp {


    public static void main(String[] args) {

         // imagine we have a hve a contact list for a phonebook, we need to display the names
        //in alphabetical order

       String[] contacts={"John Cena","Dwanye Johnson","Shemus","CmPunk"};
       Arrays.sort(contacts,(str1,str2)->str1.compareTo(str2));

       for (String contact:contacts){
           System.out.println(contact);
       }
    }

}
