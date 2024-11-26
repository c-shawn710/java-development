package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class NorthwindProjectRefactoredDM {
    public static void main(String[] args) {

        //Get username and password
        String username = args[0];
        String password = args[1];

        //Create the datasource
        BasicDataSource dataSource = new BasicDataSource();

        //Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        //Create the NorthwindDataManager
        NorthwindDataManager dataManager = new NorthwindDataManager(dataSource);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the main menu
            System.out.println("What do you want to do?");
            System.out.println("1) Display a product by ID");
            System.out.println("2) Display all products");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                // Display a product by ID
                System.out.print("Enter ProductID: ");
                int productId = scanner.nextInt();
                scanner.nextLine();

                Product product = dataManager.getProductById(productId);

                if (product != null) {
                    System.out.println("Product Details:");
                    System.out.println(product);
                } else {
                    System.out.println("No product found with ID: " + productId);
                }

            } else if (choice == 2) {
                // Display all products
                System.out.println("All Products:");
                dataManager.getAllProducts().forEach(System.out::println);

            } else if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
