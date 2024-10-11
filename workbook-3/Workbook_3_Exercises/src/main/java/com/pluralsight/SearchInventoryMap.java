package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class SearchInventoryMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> searchMap = new HashMap<Integer, String>();

        try {
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader buffReader = new BufferedReader(fileReader);

            String input;
            while ((input = buffReader.readLine()) != null) {
                String[] products = input.split("\\|");
                int id = Integer.parseInt(products[0]); //index 0 because we split it between | on line 19. Products was set to String[] so we parse to int
                String prodInfo = ("Product ID: " + id + " | Product Name: " + products[1] + "Price: $gh,,gx,k" + products[2]); //products[1] is referring to 1 index which was split |
                searchMap.put(id, prodInfo);
            }
            System.out.println("What item # are you interest in?: ");
            int id = scanner.nextInt();
            System.out.println(searchMap.get(id));


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }
}







/*Write the code for the app that was demonstrated in the previous pages.
* Add a loadInventory() method to load all the products from the Inventory.csv file.
* Create product from each line and add it to a Map.
* Use product name as a map key so that users can search for products by name.*/