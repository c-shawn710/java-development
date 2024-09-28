package com.pluralsight;
import java.util.Scanner;


public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = myScanner.nextFloat();

        System.out.println("Enter the second number ");
        float num2 = myScanner.nextFloat();

        System.out.println("Please select an option: ");
        System.out.println("(A)ddition, (S)ubtration, (M)ultiply, (D)ivide: ");


        //stores user input
        char ans = myScanner.next().charAt(0);
        myScanner.close();

        float answer = 0;
        String operator = " ";

        if(ans == 'A') {
            answer = num1 + num2;
            operator = "+";
        } else if(ans == 'S') {
            answer = num1 - num2;
            operator = "-";
        } else if(ans == 'M') {
            answer = num1 * num2;
            operator = "*";
        } else if(ans == 'D') {
            answer = num1 / num2;
            operator = "/";
        } else {
            System.out.println("Incorrect input");
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
    }
}