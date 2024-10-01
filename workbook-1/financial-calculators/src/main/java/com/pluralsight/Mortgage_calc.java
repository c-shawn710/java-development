package com.pluralsight;
import java.util.Scanner;

public class Mortgage_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your loan amount: ");
        double loan = scanner.nextDouble();

        System.out.println("Please input your interest rate in decimal: ");
        double annualRate = scanner.nextDouble();

        System.out.println("Please input length of the loan in years: ");
        int loanYears = scanner.nextInt();

        //Write it line by line
        double monthlyintRate = (annualRate / 12);
        monthlyintRate += 1;
        monthlyintRate = Math.pow(monthlyintRate, 180);
        double monthPow180 = monthlyintRate;
        monthlyintRate = monthlyintRate * (annualRate/12);
        monthPow180 -= 1;
        monthlyintRate /= monthPow180;
        monthlyintRate *= loan;

        double totalInt = monthlyintRate * 12 * loanYears - loan;


                //double monthlyPayment = loan * (((monthlyintRate) * Math.pow(1 + monthlyintRate, 180)) / Math.pow(1 + monthlyintRate, 180) - 1);

        System.out.println("Your expected monthly payment is: $" + monthlyintRate);
        System.out.println("Your total interest is: $ " + totalInt);

        scanner.close();
    }
}