package CarDealershipDB_miniExercises;

import java.sql.*;

public class Question_1 {
    public static void main(String[] args) throws SQLException {
        //Display all the cars that you have in the dealership
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_dealership", args[0], args[1]);

        String query = """
                SELECT 
                    v.VIN,
                    v.make,
                    v.model,
                    v.year,
                    v.price,
                    d.name AS dealership_name
                FROM 
                    inventory i
                JOIN 
                    vehicles v ON i.VIN = v.VIN
                JOIN 
                    dealerships d ON i.dealership_ID = d.dealership_ID;
                """;

        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println("Dealership: " + rs.getString(6));
            System.out.println("VIN: " + rs.getString(1));
            System.out.println("Make: " + rs.getString(2));
            System.out.println("Model: " + rs.getString(3));
            System.out.println("Year: " + rs.getInt(4));
            System.out.println("Price: $" + rs.getDouble(5));
            System.out.println("------------------------");
        }
    }
}
