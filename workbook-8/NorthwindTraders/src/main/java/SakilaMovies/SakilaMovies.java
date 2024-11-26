package SakilaMovies;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SakilaMovies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Step 1: Ask for the actor's last name
        System.out.println("Enter an actor's last name: ");
        String lastName = scanner.nextLine();

        //Step 2: Query actors by last name
        findActorsByLastName(lastName);

        //Step 3: Ask for actor's full name to query their movies
        System.out.println("Enter actor's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter actor's last name:");
        lastName = scanner.nextLine();

        //Step 4: Query movies by actor's full name
        findMoviesByActor(firstName, lastName);
    }

    public static void findActorsByLastName(String lastName) {
        String query = "SELECT * FROM actor WHERE last_name = ?";

        try (
                Connection connection = SakilaDataManager.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
            ) {

            statement.setString(1, lastName);

        try (
                ResultSet rs = statement.executeQuery()
            ) {
            if (rs.next()) {
                System.out.println("Actors found: ");
                System.out.println("ActorID: First name, Last name");
                do {
                    System.out.println(rs.getInt("actor_id") + ": " + rs.getString("first_name") + " " + rs.getString("last_name"));
                } while (rs.next());
            } else {
                System.out.println("No actors found.");
            }
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void findMoviesByActor(String firstName, String lastName) {
        String query = """
                SELECT
                    f.title
                FROM
                    film f
                JOIN
                    film_actor fa
                ON
                    f.film_id = fa.film_id
                JOIN
                    actor a
                ON
                    fa.actor_id = a.actor_id
                WHERE
                    a.first_name = ? AND a.last_name = ?
                """;

        try (
            Connection connection = SakilaDataManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)
        ) {

            statement.setString(1, firstName);
            statement.setString(2, lastName);

        try (ResultSet rs = statement.executeQuery()) {
            if (rs.next()) {
                System.out.println("Movies featuring " + firstName + " " + lastName + ": ");
                do {
                    System.out.println(rs.getString("title"));
                } while (rs.next());
            } else {
                System.out.println("No films found for that actor.");
            }
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
