package NorthwindDB_miniExercises;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1])) {
            //Prompt user for what property of a product they find important
            System.out.println("What property of a product do you find important?\n" +
                    "1. Product Name\n" +
                    "2. SupplierID\n" +
                    "3. CategoryID");
            int choice = scanner.nextInt();
            scanner.nextLine();

            String query = "";
            PreparedStatement statement;

            if (choice == 1) {
                System.out.println("Enter product name: ");
                String productName = scanner.nextLine();

                query = "SELECT ProductName, QuantityPerUnit, UnitPrice FROM products WHERE productname LIKE ?;"; //Like for partial matching, = for exact search
                statement = connection.prepareStatement(query);
                statement.setString(1, "%" + productName + "%");

            } else if (choice == 2) {
                //Filter by SupplierID using CompanyName
                System.out.println("Enter SupplierID: ");
                String companyName = scanner.nextLine();

                query = """
                        SELECT 
                            ProductName, 
                            QuantityPerUnit, 
                            UnitPrice
                        FROM
                            products
                        JOIN 
                            suppliers
                        ON 
                            suppliers.SupplierID = products.SupplierID
                        WHERE 
                            suppliers.CompanyName = ?;
                        """;

                statement = connection.prepareStatement(query);
                statement.setString(1, companyName);

            } else if (choice == 3) {
                //Filter by CategoryID using CategoryName
                System.out.println("Enter the category name: ");
                String categoryName = scanner.nextLine();

                query = """
                        SELECT
                            ProductName, 
                            QuantityPerUnit, 
                            UnitPrice
                        FROM
                            products
                        JOIN
                            categories
                        ON
                            categories.CategoryID = products.CategoryID
                        WHERE
                            categories.CategoryName = ?;
                        """;

                statement = connection.prepareStatement(query);
                statement.setString(1, categoryName);

            } else {
                System.out.println("Invalid choice. Exiting...");
            }

            //Execute query and display results
            //try (ResultSet rs = statement.executeQuery()) {

           // }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
