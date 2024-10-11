package com.pluralsight;
import java.util.Scanner;

public class CellPhoneServiceApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //prompt user
        System.out.println("What is the serial number?: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What model is the phone?: ");
        String model = scanner.nextLine();

        System.out.println("What is the carrier?: ");
        String carrier = scanner.nextLine();

        System.out.println("What is the your phone number?: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who are you calling?: ");
        String phoneNumber2 = scanner.nextLine();

        System.out.println("Who is the owner of the phone?: ");
        String owner = scanner.nextLine();

        //Create new instance (phone) of CellPhone (CellPhone is the class)>this the method from CellPhone.java<
        //In the parenthesis are the setters
        CellPhone phone = new CellPhone();

        //Set the fields
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);
        phone.dial(phoneNumber);

        //Create second instance of CellPhone Object
        CellPhone phone2 = new CellPhone();
        phone2.setSerialNumber(serialNumber);
        phone2.setModel(model);
        phone2.setCarrier(carrier);
        phone2.setPhoneNumber(phoneNumber2);
        phone2.setOwner(owner);
        phone2.dial(phoneNumber2);
    }

    public static void display(CellPhone phone) {
        display(phone);
    }
    public static void display2(CellPhone phone2) {
        display(phone2);
    }


        //Add static method called display() that accepts CellPhone object as a parameter

        //Display properties of phone to user
        //System.out.println("Serial Number: " + phone.getSerialNumber() + "\n" + "Model: " + phone.getModel() + "\n" + "Carrier: " + phone.getCarrier() + "\n" + "Phone Number: " + phone.getPhoneNumber() + "\n" + "Owner: " + phone.getOwner());
    }



