package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter hours worked: ");
        float hours = scanner.nextFloat();

        System.out.println("Enter pay rate: ");
        float pay = scanner.nextFloat();

        System.out.println("Hello, " + name + "!" + " Your gross pay for working " + hours + " hours is: " + hours * pay);
    }
}
