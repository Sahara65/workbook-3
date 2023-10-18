package com.pluralsight;

import java.util.*;

public class FamousQuotes {
    public static int index;

    public static void main(String[] args) {

        String[] quotes = {"Be like a diamond, precious and rare, not like a stone, found everywhere.",
                "Speak only when your words are more beautiful than the silence.",
                "The more you let go, the higher you rise.",
                "The richest of the rich is the one who is not a prisoner to greed.",
                "Patience and time grow the seed that blossoms into wisdom.",
                "Be curious.",
                "Real leadership...comes from realizing that the time has come to move beyond waiting to doing.",
                "People will forget what you said, people will forget what you did, but people will never forget how you made them feel.",
                "If you don't stand for something, you'll fall for anything.",
                "The most common way people give up their power is by thinking they don’t have any."};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please select a quote from using 1-10: ");
            int index = scanner.nextInt();
            index--;

            System.out.println(quotes[index]);
            System.out.println("Would you like an additional quote? (yes/no)");

            String yesInput = "yes";
            String noInput = "no";
            String reply = scanner.next();
            while (reply.equals(yesInput)) {
                reply = scanner.next().toLowerCase();

                if (reply.equals(yesInput)) {
                    System.out.println("Please select a quote from using 1-10: ");

                }
                else if (reply.equals(noInput)) {
                    System.out.println("Understandable, have a nice day!");
                }
                else {
                    System.out.println("Incorrect input. Please only enter a number between 1-10!");
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect input. Please only enter a number between 1-10! Try again.");
            System.out.println("Please select a quote from using 1-10: ");
            int index = scanner.nextInt();

            System.out.println(quotes[index]);
        }
    }
}