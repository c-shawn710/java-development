package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name: " + " ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Please enter your middle name: " + " ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Please enter your suffix:  " + " ");
        String suffix = scanner.nextLine().trim();

        String fullName = "";

        if(!firstName.isEmpty()) {
            fullName += firstName + " ";
        }
        if(!middleName.isEmpty()) {
            fullName += middleName + "." + " ";
        }
        if(!lastName.isEmpty()) {
            fullName += lastName;
        }
        if(!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        System.out.println(fullName);
    }
}