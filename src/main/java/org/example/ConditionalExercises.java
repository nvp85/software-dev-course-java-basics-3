package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        // Replace the line below with code that returns true if x is less than 5, and false otherwise
        // (use an if statement with an else block.)
        if (x<5) {
            return true;
        } else {
            return false;
        }
    }

    public String getAgeGroup(int age) {
        // Replace the line below with code that returns "child" if age is less than 13,
        // "teen" if age is less than 20, and "adult" otherwise
        // (use if, else if, and else)
        if (age >= 20) {
            return "adult";
        } else if (age >= 13) {
            return "teen";
        } else {
            return "child";
        }
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();

        // Replace the line below with code that returns true if password is at least 8 characters long
        // and false otherwise
        // (use an if statement with an else block.)
        if (passwordLength >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
