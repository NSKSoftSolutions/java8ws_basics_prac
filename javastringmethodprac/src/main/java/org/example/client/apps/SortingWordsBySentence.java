package org.example.client.apps;

import java.util.Arrays;

public class SortingWordsBySentence {

    public static void main(String[] args) {

        String sentence = "Hello JAVA Developer welcome to programming";
        String[] words = sentence.split(" ");
        Arrays.sort(words, (word1, word2) -> word1.compareTo(word2));
        for (String word : words) {
            System.out.println(word);
        }

    }

}
