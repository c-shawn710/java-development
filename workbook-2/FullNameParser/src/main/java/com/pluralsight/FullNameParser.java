package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine();

        //split fullName input on the spaces and store in array string
        String[] nameParts = fullName.split("\\s");  // "\\s" is for white space

        //create variables for nameParts
        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        //check length
        if(nameParts.length == 2) {             //if length is 2: fn array[0], mn (none), ln [1]
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {     //if length is 3: fn array[0], mn array[1], ln array[3]
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("ISSUE!");
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}

