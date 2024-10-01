package com.pluralsight;
import java.util.Scanner;

public class FV_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your deposit amount: ");
        double deposit = scanner.nextDouble();

        System.out.println("Please input your annual interest rate: ");
        double intPercentRate = scanner.nextDouble();

        System.out.println("Please enter the number of years until maturity date: ");
        int years = scanner.nextInt();

        int dailyCompound = 365;
        double intRate = intPercentRate / 100;
        double total = intRate / dailyCompound;
        double result = dailyCompound * years;
        //total += 1;
        //total *= deposit;
        total = deposit*Math.pow(1+total, result);
        //total = Math.pow((deposit *(1+(intRate/dailyCompound))), result);
        //For some reason line 21, 22, 24 was resulting in 'Infinity'

        System.out.println("Your future value for your deposit is: $ " + total);
    }
}