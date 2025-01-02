package org.example.domain;

import java.util.Arrays;

public class Book {

    public String[] listTheAuthorsInASC(String[] authors) {
        Arrays.sort(authors, (author1, author2) -> author1.compareTo(author2));
        return authors;
    }

    public String[] listWordsInParagraph(String paragraph) {
        return paragraph.split("[ .,]");
    }

}
