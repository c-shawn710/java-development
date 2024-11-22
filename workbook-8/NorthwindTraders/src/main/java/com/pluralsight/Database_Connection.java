package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Database_Connection {
    public static void main(String[] args) throws SQLException {
        //get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup");

        //create statement
        String query = "SELECT productName, productID FROM products";
        PreparedStatement statement = connection.prepareStatement(query);

        //execute query
        ResultSet rs = statement.executeQuery();

        //process result
        while (rs.next()) {
            System.out.println(rs.getString(1) + " : " + rs.getInt(2));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an ID number to display product");

        int id = scanner.nextInt();
        scanner.nextLine();

        //create second statement
        String query2 = "SELECT productName, productID FROM products WHERE productID = ?";
        PreparedStatement statement2 = connection.prepareStatement(query2);

        //set param for the ID
        statement2.setInt(1, id);

        //execute query and process result
        ResultSet rs2 = statement2.executeQuery();
        while (rs2.next()) {
            System.out.println(rs2.getString("productName") + " : " + rs2.getInt("productID"));
        }
        connection.close();
    }
}
