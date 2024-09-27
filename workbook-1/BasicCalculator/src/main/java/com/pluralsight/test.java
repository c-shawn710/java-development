package com.pluralsight;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = myScanner.nextFloat();

        System.out.println("Enter the second number ");
        float num2 = myScanner.nextFloat();


        System.out.println("Enter the operator (+, -, *, /): ");

            char op = myScanner.next().charAt(0);
            float ans = 0;

            switch (op) {
            case '+':
            ans = num1 + num2;
            break;

            case '-':
            ans = num1 - num2;
            break;

            case '*':
            ans = num1 * num2;
            break;

            case '/':
            ans = num1 / num2;
            break;

            default:
                System.out.println("Incorrect Input");
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
        }
}

