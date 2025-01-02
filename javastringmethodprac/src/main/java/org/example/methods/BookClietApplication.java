package org.example.methods;

import org.example.domain.Book;

public class BookClietApplication {
    public static void main(String[] args) {
        Book book = new Book();
        String[] sortedAuthors = book.listTheAuthorsInASC(new String[]{"james gosling", "sajjad nawab", "ayan nawab", "sadakhat nawab"});
        for (String author : sortedAuthors) {
            System.out.println(author);
        }
        String paragraph = "The `concat(String str)` method in the Java `String` class is used to join a " +
                "specified string to the end of the current string, creating a new string with the combined value." +
                " Since strings in Java are immutable, the original string remains unchanged, and a new string " +
                "object is created to hold the concatenated result. The method accepts a single `String` " +
                "parameter and returns the newly formed string. If the parameter is `null`, a `NullPointerException` " +
                "is thrown. For example, calling `\"Hello\".concat(\" World\")` will return the string `\"Hello World\"`. " +
                "The `concat()` method is often used in scenarios where strings need to be dynamically built, such as forming URLs (`\"https://example.com/\".concat(\"api\")`) or combining user inputs like first and last names. While the `+` operator is more commonly used for string " +
                "concatenation due to its simplicity, `concat()` is a more explicit alternative, provided `null` values are handled.";
        String[] words = book.listWordsInParagraph(paragraph);
        System.out.println("Words available in a paragraph is -->" + words.length);
    }
}
