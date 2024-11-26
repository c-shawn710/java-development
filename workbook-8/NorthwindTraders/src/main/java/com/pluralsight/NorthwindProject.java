package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class NorthwindProject {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Application needs two arguments to run: <username> + <password>");
            System.exit(0);
        }
        Scanner scanner = new Scanner(System.in);
        homeScreen(scanner, args);
    }

    public static void homeScreen(Scanner scanner, String[] args) {
        while (true) {
            System.out.println("What do you want to do?\n" +
                    "1) Display all products\n" +
                    "2) Display all customers\n" +
                    "0) Exit\n" +
                    "Select an option: ");

            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                allProducts(args);
                break;
            } else if (input == 2) {
                allCustomers(args);
                break;
            } else if (input == 0) {
                System.exit(0);
            }
        }
    }

    public static void allProducts(String[] args) {
        try (
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products")
        ) {

            try (
                ResultSet rs = statement.executeQuery()
            ) {

                while (rs.next()) {
                    System.out.println("ProductID: " + rs.getInt(1));
                    System.out.println("ProductName: " + rs.getString(2));
                    System.out.println("SupplierID: " + rs.getInt(3));
                    System.out.println("CategoryID: " + rs.getInt(4));
                    System.out.println("QuantityPerUnit: " + rs.getString(5));
                    System.out.println("UnitPrice: " + rs.getDouble(6));
                    System.out.println("UnitsInStock: " + rs.getInt(7));
                    System.out.println("UnitsOnOrder: " + rs.getInt(8));
                    System.out.println("ReorderedLevel: " + rs.getInt(9));
                    System.out.println("Discontinued: " + rs.getInt(10));
                    System.out.println("--------------------------");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void allCustomers(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM customers")
        ) {

            try (ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {
                    System.out.println("CustomerID: " + rs.getString(1));
                    System.out.println("CompanyName: " + rs.getString(2));
                    System.out.println("ContactName: " + rs.getString(3));
                    System.out.println("ContactTitle: " + rs.getString(4));
                    System.out.println("Address: " + rs.getString(5));
                    System.out.println("City: " + rs.getString(6));
                    System.out.println("Region: " + rs.getString(7));
                    System.out.println("PostalCode: " + rs.getString(8));
                    System.out.println("Country: " + rs.getString(9));
                    System.out.println("Phone: " + rs.getString(10));
                    System.out.println("Fax: " + rs.getString(11));
                    System.out.println("--------------------------");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
