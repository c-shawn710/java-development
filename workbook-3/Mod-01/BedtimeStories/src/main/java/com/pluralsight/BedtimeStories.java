package com.pluralsight;
import java.io.FileInputStream;
import java.util.Scanner;
import java.lang.System;

public class BedtimeStories {

    private static Scanner consoleScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Choose a bedtime story: Goldilocks, Hansel_and_Gretel, Mary_had_a_little_lamb");
        String chosenStory = consoleScanner.nextLine();

        try {
            int lineNumber = 1;
            //FileInputStream fis = new FileInputStream(chosenStory + ".txt"); Alternative way
            Scanner storyScanner = new Scanner(new FileInputStream(chosenStory + ".txt"));
            while (storyScanner.hasNextLine()) {
            String line = storyScanner.nextLine();
            System.out.println(lineNumber + ". " + line);
            lineNumber++;
}
    }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

