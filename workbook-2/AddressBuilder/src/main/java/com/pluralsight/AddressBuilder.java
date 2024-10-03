package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {
        StringBuilder info = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        //Prompt user for their Billing and shipping addresses
        System.out.println("Please provide the following information:\nFull Name: ");
        String name = scanner.nextLine();

        System.out.println("Billing Street: ");
        String addStreet = scanner.nextLine();

        System.out.println("Billing City: ");
        String addCity = scanner.nextLine();

        System.out.println("Billing State");
        String addState = scanner.nextLine();

        System.out.println("Billing Zip: ");
        String addZip = scanner.nextLine();

        System.out.println("Shipping street: ");
        String shipStreet = scanner.nextLine();

        System.out.println("Shipping City: ");
        String shipCity = scanner.nextLine();

        System.out.println("Shipping State: ");
        String shipState = scanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shipZip = scanner.nextLine();

        //Use StringBuilder to dynamically build the string that holds all the address info
        info.append(name+"\n");
        StringBuilder append = info.append("Billing Address:\n" + addStreet + "\n");
        info.append(addCity + ", " + addState + " " + addZip + "\n");
        info.append("Shipping Address:\n");
        info.append(shipStreet + "\n");
        info.append(shipCity + ", " + shipState + " " + shipZip);

        // retrieve the underlying characters from the StringBuilder
        String myInfo = info.toString();

        //Display the info to the user
        System.out.println(myInfo);
    }
}
