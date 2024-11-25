package NorthwindDB_miniExercises;

import java.sql.*;
import java.util.Scanner;

public class Question_2 {
    //Prompt the User for a category name from the Categories table
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1])) {
            System.out.println("Input a category name: ");
            String input = scanner.nextLine();

            String query1 = "SELECT * FROM categories WHERE CategoryName = ?;";
            PreparedStatement statement1 = connection.prepareStatement(query1);
            statement1.setString(1, input);
            ResultSet rs = statement1.executeQuery();

            while (rs.next()) {
                System.out.println("CategoryID: " + rs.getInt(1));
                System.out.println("CategoryName: " + rs.getString(2));
                System.out.println("Description:" + rs.getString(3));
                System.out.println("------------------------");
            }

            //Ask if they want to see the products in that category.
            //If so, display the ProductName, QuantityPerUnit, and UnitPrice for all products in the selected category.
            //If not, display BYE.
            System.out.println("Would you like to see the products in this category?: Y/N");
            String input2;

            while(true) {
                input2 = scanner.nextLine();
                if (input2.equalsIgnoreCase("y")) {
                    String query2 = """
                            SELECT 
                                ProductName, 
                                QuantityPerUnit, 
                                UnitPrice 
                            FROM 
                                products 
                            JOIN 
                                categories
                            ON 
                                categories.CategoryID = products.CategoryID;
                            """;

                    PreparedStatement statement2 = connection.prepareStatement(query2);
                    ResultSet rs2 = statement2.executeQuery();

                    while (rs2.next()) {
                        System.out.println("Product Name: " + rs2.getString(1));
                        System.out.println("QuantityPerUnit: " + rs2.getString(2));
                        System.out.println("UnitPrice: " + rs2.getDouble(3));
                        System.out.println("------------------------");
                    }
                    rs2.close();
                    statement2.close();
                    break;
                } else if (input2.equalsIgnoreCase("n")) {
                    System.out.println("BYE");
                    break;
                } else {
                    System.out.println("Please select 'Y' or 'N'");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
