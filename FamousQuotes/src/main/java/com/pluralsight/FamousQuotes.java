package com.pluralsight;

import java.util.*;

public class FamousQuotes {
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

        boolean isDone = false;

        try {
            do {
                int index = getIntInput("Please pick a quote from 1-10: ");
                index--;
                System.out.println(quotes[index]);

                String reply = getStringInput("Would you like an additional quote? (yes/no)");

                if (reply.equals("no")) {
                    isDone = true;
                }
            }

            while (!isDone);

        } catch (Exception e) {
            System.out.println("Ayo bud, that's incorrect!");
        }
    }



    public static int getIntInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String input = scanner.next();
        scanner.nextLine();
//        scanner.close();
        return input;
    }
}