package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        String[] quotes = {"Be yourself; everyone is already taken.", "You only live once, but if you do it right, once is enough.", "Be the change that you wish to see in the world.", "Always forgive your enemies; nothing annoys them so much",
                "In three worlds I can sum up everything I've learned about life: it goes on.", "If you tell the truth, you don't have to remember anything.", "A friend is someone who knows all about you and still loves you.",
                "To live is the rarest thing in the world. Most people exist, that is all.", "Live as if you were to die tomorrow. Learn as if you were to live forever.", "We accept the love we think we deserve."};

        Scanner scanner = new Scanner(System.in);
        boolean yes = true;

        do {
            try {
                System.out.println("Select a number between 1 to 10: ");
                int number = scanner.nextInt();
                scanner.nextLine();
                System.out.println(quotes[number - 1]);

            } catch (Exception e) {
                System.out.println("Number is out of range.");
                }
            System.out.println("Would you like to select another number?: y / n");
            String anotherNumber = scanner.nextLine();
            if (anotherNumber.equalsIgnoreCase("y")) {
                yes = true;
            } else {
                yes = false;
            }
        }
        while (yes);
    }
}
