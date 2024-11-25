package NorthwindDB_miniExercises;

import java.sql.*;

public class Question_1 {
    public static void main(String[] args) throws SQLException {
        //Write query to fetch and display all products in the Products table.
        // Show the ProductName, QuantityPerUnit, and UnitPrice
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);

        String query = "SELECT ProductName, QuantityPerUnit, UnitPrice FROM products;";

        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println("ProductName: " + rs.getString(1));
            System.out.println("QuantityPerUnit: " + rs.getString(2));
            System.out.println("UnitPrice: " + rs.getDouble(3));
            System.out.println("---------------------------");
        }
        rs.close();
        statement.close();
    }
}
