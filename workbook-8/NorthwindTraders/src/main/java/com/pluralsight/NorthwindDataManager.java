package com.pluralsight;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NorthwindDataManager {
    private DataSource dataSource;

    public NorthwindDataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //Get all products
    List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        //Fetch products from database
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT productID, productName, unitPrice FROM products");
            ResultSet rs = statement.executeQuery()
            ) {
            while (rs.next()) {
                int id = rs.getInt("ProductID");
                String name = rs.getString("ProductName");
                double price = rs.getDouble("UnitPrice");

                Product product = new Product(id, name, price);
                products.add(product);

                //products.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3))); This is everything above but in one line.
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    public Product getProductById(int productId) {
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT ProductID, ProductName, UnitPrice FROM products WHERE ProductID = ?");
            ) {

            statement.setInt(1, productId);

        try(ResultSet rs = statement.executeQuery()) {
            if (rs.next()) { //Check if a result exists
                int id = rs.getInt("ProductID");
                String name = rs.getString("ProductName");
                double price = rs.getDouble("UnitPrice");
                return new Product(id, name, price); //Return the Product instance
            } else {
                return null; //No product found
            }
        }

        } catch (SQLException e) {
            System.out.println("Error");
        }
        return null; //Return null in case of an exception
    }
}
