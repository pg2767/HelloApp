package org.example;

public class Main {
    public static void main(String[] args) {
        String names;

        // Check if arguments are provided
        if (args.length == 0) {
            // Default case when no arguments are passed
            names = "World";
        } else {
            // Join all arguments with a comma (e.g., "Alice, Bob, Charlie")
            names = String.join(", ", args);
        }

        // This now runs regardless of whether args were provided or not
        System.out.println("Hello, " + names + "!");
    }
}