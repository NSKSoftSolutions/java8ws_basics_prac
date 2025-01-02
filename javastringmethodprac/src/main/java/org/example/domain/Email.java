package org.example.domain;

import java.util.regex.Pattern;

public class Email {
    public boolean validateEmailId(String email) {
        return email.contains("@");
    }

    public boolean validateUser(String userName) {
        return (Pattern.compile("[@ # $ % & *]").matcher(userName).find()) && userName.length() > 4;
    }

}
