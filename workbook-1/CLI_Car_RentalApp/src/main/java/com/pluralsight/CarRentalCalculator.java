package com.pluralsight;
import java.util.Scanner;

public class CarRentalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt and store pickup day
        System.out.println("Please select the date you would like to pick up you car?: ");
        String pickup = scanner.nextLine();

        /* Sun-Sat format while displaying error if user enters wrong day
           System.out.println("Mon Tues Wed Thurs Fri Sat Sun");
           while ((!pickup.equalsIgnoreCase("Mon")) && (!pickup.equalsIgnoreCase("Tues")) && (!pickup.equalsIgnoreCase("Wed")) && (!pickup.equalsIgnoreCase("Thurs")) && (!pickup.equalsIgnoreCase("Fri")) && (!pickup.equalsIgnoreCase("Sat")) && (!pickup.equalsIgnoreCase("Sun"))) {
           System.out.println("Invalid day");
           pickup = scanner.nextLine(); */

        //Prompt and store number of days for car rental
        System.out.println("Enter number of days for rental: ");
        int days = scanner.nextInt();

        //Electronic toll tag for $3.95/day? (yes/no)
        System.out.println("Would you like an Electronic toll tag for $3.95 per day? yes / no");

        float tollprice = 0f;
        float gpsprice = 0f;
        float raprice = 0f;
        float basic = 29.99f;
        float surcharge = 0f;
        float perday = (basic * days);

        String toll = scanner.next();
        if (toll.equalsIgnoreCase("yes")) {
            tollprice = 3.95f;
        } else if (toll.equalsIgnoreCase("no")) {
            tollprice = 0f;
        } else {
            System.out.println("Invalid option");
        }

        //GPS for $2.95/day? (yes/no)
        System.out.println("Would you like a GPS for $2.95 per day? yes / no");

        String gps = scanner.next();
        if (gps.equalsIgnoreCase("yes")) {
            gpsprice = 2.95f;
        } else if (gps.equalsIgnoreCase("no")) {
            gpsprice = 0f;
        } else {
            System.out.println("Invalid option");
        }

        //Roadside assistance for $3.95/day? (yes/no)
        System.out.println("Would  you like Roadside Assistance for $3.95 per day? yes / no");

        String ra = scanner.next();
        if (ra.equalsIgnoreCase("yes")) {
            raprice = 3.95f;
        } else if (ra.equalsIgnoreCase("no")) {
            raprice = 0f;
        } else {
            System.out.println("Invalid option");
        }

        //Ask user's age and calculate surcharge if younger than 25
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age < 25) {
            surcharge = (basic * .3f);
            }

        scanner.close();

        //Display total cost
        float total = tollprice + gpsprice + raprice + perday + surcharge;
        System.out.println("Your car will be ready for pickup on: " + pickup);
        System.out.println("Your total cost is: $" + total);
        }
}


/* Calculate and display:
    -Basic car rental ($29.99 per day)
    -Options cost
    -Underage driver surcharge (30% on basic car rental for under 25)
    -Total cost
 */