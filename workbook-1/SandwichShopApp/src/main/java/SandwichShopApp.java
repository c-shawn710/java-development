package com.pluralsight;
import java.util.Scanner;

public class SandwichShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Get size of sandwich
        System.out.println("Select the size for your sandwich: ");
        System.out.println("Regular - $5.45  or  Large - $8.95");
        String size = scanner.nextLine();

        //Display error if user enters invalid size
        while ((!size.equalsIgnoreCase("regular")) && (!size.equalsIgnoreCase("large"))){
            System.out.println("Invalid size");
            System.out.println("Type out 'regular' or large': ");
            size = scanner.nextLine();
        }

        //Prompt user if they want loaded sandwich (yes/no)
        System.out.println("Would you like a 'loaded' sandwich?: yes  or  no");
        String loaded = scanner.nextLine();

        //Display error if user enters invalid choice
        while ((!loaded.equalsIgnoreCase("yes")) && (!loaded.equalsIgnoreCase("no"))) {
            System.out.println("Invalid choice");
            System.out.println("Wrong answer dumbo: select 'yes' or 'no' if you want a loaded sandwich: ");
            loaded = scanner.next();
        }

        //Get age of customer
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();


        //Set prices based on size & add if want 'loaded'
        float price = 0.0f;
        if (size.equalsIgnoreCase("regular")) {
            price = 5.45f;
            if (loaded.equalsIgnoreCase("yes"))
                price = 5.45f + 1.00f;
        } else if (size.equalsIgnoreCase("large")) {
            price = 8.95f;
            if (loaded.equalsIgnoreCase("yes"))
                price = 8.95f + 1.75f;
        }

        //Calculate discount based on age
        float discount = 0.0f;
        if (age <= 17) {
            discount = (price * .10f);
        } else if (age >= 65) {
            discount = (price * .20f);
        } else {
            System.out.println("Ineligible for discount");
        }

        //Calculate final price
        float finalprice = (price - discount);

        //Display final price
        System.out.println("Your final price is: $" + finalprice);

        scanner.close();
    }
}