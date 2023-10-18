package com.pluralsight;

import java.io.*;
import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String [] args) throws FileNotFoundException {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the name of a story: ");
        String getUserInput = inputScanner.nextLine();

    try {
            FileInputStream fis = new FileInputStream(getUserInput);
            Scanner fileScanner = new Scanner(fis);
            int i = 1;

            while (fileScanner.hasNextLine()) {
                System.out.println(i + ". " + fileScanner.nextLine());
                i++;
            }
    }
    catch (FileNotFoundException e){
            System.out.println("File not found!! Please type either: goldilocks.txt, hansel_and_gretel.txt, or mary_had_a_little_lamb.txt");
            e.printStackTrace();

        }




    }
}
