package org.example.client.apps;

import java.util.Arrays;

public class SortingWordsInASentecne2 {
    public static void main(String[] args) {

        String message = "Hi,Good Morning,to all,my subscribers";
        String[] words = message.split(",");
        Arrays.sort(words, (word1, word2) -> word1.compareTo(word2));
        for (String newWord : words) {
            System.out.println(newWord);
        }

    }
}
