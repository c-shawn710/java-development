package com.pluralsight;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate finalDate = LocalDate.parse(date, dtf);

        System.out.println("How many ticket(s) would you like?: ");
        int tickets = scanner.nextInt();

        String ticketWord = tickets ==1 ? "ticket" : "tickets" ;
        System.out.println(tickets + " " +ticketWord + " reserved for " + finalDate + " under " + name +".");
        }
    }
