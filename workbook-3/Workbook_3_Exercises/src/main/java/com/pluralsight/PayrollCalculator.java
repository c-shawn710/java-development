package com.pluralsight;

import com.pluralsight.out.production.pluralsight.com.pluralsight.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            FileReader employeeFile = new FileReader("C:\\Users\\c_sha\\Desktop\\pluralsight\\java-development\\workbook-3\\Workbook_3_Exercises\\src\\main\\java\\com\\pluralsight\\employees.csv");
            BufferedReader bufReader = new BufferedReader(employeeFile);

            String input;
            bufReader.readLine();
            while((input = bufReader.readLine()) != null) {
                String[] columns = input.split("\\|");
                Employee employee = new Employee(Integer.parseInt(columns[0]), columns[1], Double.parseDouble(columns[2]), Double.parseDouble(columns[3]));
                System.out.printf("Employee: %s, Employee ID: %d, Gross Pay: $%.2f\n", employee.getName(), employee.getEmployeeId(), employee.getcalcGrossPay());
            }
            bufReader.close();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
