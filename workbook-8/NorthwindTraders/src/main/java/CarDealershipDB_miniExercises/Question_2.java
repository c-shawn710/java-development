package CarDealershipDB_miniExercises;

import java.sql.*;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get the connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_dealership", args[0], args[1])) {
            // #1.Prompt user for dealership name
            System.out.println("Enter the name of the dealership you want to view: ");
            String dealershipName = scanner.nextLine();

            //Query to get dealership details
            String query = "SELECT * FROM dealerships WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, dealershipName);

            // #2. Execute query and display dealership details
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                System.out.println("Dealership_ID: " + rs.getInt(1));
                System.out.println("Dealership Name: " + rs.getString(2));
                System.out.println("Address: " + rs.getString(3));
                System.out.println("City: " + rs.getString(4));
                System.out.println("State: " + rs.getString(5));
                System.out.println("Zip: " + rs.getInt(6));
                System.out.println("Phone: " + rs.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
