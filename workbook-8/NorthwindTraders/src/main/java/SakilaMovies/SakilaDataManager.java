package SakilaMovies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SakilaDataManager {
    private static final String url = "jdbc:mysql://localhost:3306/sakila";
    private static final String username = "root";
    private static final String password = "yearup";

    //Provides connection to database, return Connection object, and throws SQLException if connection fails
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
