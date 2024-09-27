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
        float pay_rate = scanner.nextFloat();

        float reg_pay = 0;
        float ot_pay = 0;

        if (hours > 40) {
            float ot_hours = hours - 40;
            ot_pay = ot_hours * pay_rate * 1.5F; //remember to have 'F' next to float number, otherwise it's a double
            reg_pay = pay_rate * 40;
        } else {
            reg_pay = pay_rate * hours;
        }
        float total_pay = reg_pay + ot_pay;

        System.out.println("Hello, " + name + "!" + " Your gross pay for working " + hours + " hours is: " + "$" + total_pay);
    }
}
