package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class wkbk8_pg46 {
    public static void main(String[] args) throws SQLException {
        //get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);

        //create statement
        String query = "SELECT ProductName, ProductID, UnitPrice, UnitsInStock FROM products";
        PreparedStatement statement = connection.prepareStatement(query);

        //execute query
        ResultSet rs = statement.executeQuery();

        //process result
        while (rs.next()) {
            System.out.println("Product ID : " + rs.getInt("productID"));
            System.out.println("Name:        " + rs.getString("productName"));
            System.out.println("Price:       $" + rs.getDouble("unitPrice"));
            System.out.println("Stock:       " + rs.getString("unitsInStock"));
            System.out.println("------------------");
        }
        rs.close();
        statement.close();
        connection.close();
    }
}
