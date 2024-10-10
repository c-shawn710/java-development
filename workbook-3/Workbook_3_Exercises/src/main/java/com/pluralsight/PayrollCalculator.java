package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the file employee file to process: ");
            String empFile = scanner.nextLine();
            System.out.println("Enter the name of the payroll file to create: ");
            String payFile = scanner.nextLine();
            FileReader employeeFile = new FileReader(empFile);
            BufferedReader bufReader = new BufferedReader(employeeFile);
            FileWriter writer = new FileWriter(payFile, true);
            BufferedWriter bufWriter = new BufferedWriter(writer);


            String input;
            bufReader.readLine();
            while((input = bufReader.readLine()) != null) {
                String[] columns = input.split("\\|");
                Employee employee = new Employee(Integer.parseInt(columns[0]), columns[1], Double.parseDouble(columns[2]), Double.parseDouble(columns[3]));
                //System.out.printf("Employee: %s, Employee ID: %d, Gross Pay: $%.2f\n", employee.getName(), employee.getEmployeeId(), employee.getcalcGrossPay());
                bufWriter.write(employee.getEmployeeId() + "|" + employee.getName() + "|" + employee.getcalcGrossPay() + "\n");
            }

            bufReader.close();
            bufWriter.close();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
