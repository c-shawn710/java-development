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

        System.out.println("What is the phone number?: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone?: ");
        String owner = scanner.nextLine();

        //Create new instance of CellPhone >this the method from CellPhone.java<
        //In the parenthesis are the setters
        CellPhone phone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        //Set the fields
        //phone.setSerialNumber(serialNumber);
        //phone.setModel(model);
        //phone.setCarrier(carrier);
        //phone.setPhoneNumber(phoneNumber);
        //phone.setOwner(owner);

        //Display properties of phone to user
        System.out.println("Serial Number: " + phone.getSerialNumber()+"\n" + "Model: " + phone.getModel() + "\n" + "Carrier: " + phone.getCarrier() + "\n" + "Phone Number: " + phone.getPhoneNumber() + "\n" + "Owner: " + phone.getOwner());


    }
}
