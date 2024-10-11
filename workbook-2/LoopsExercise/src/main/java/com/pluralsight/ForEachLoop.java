package com.pluralsight;

public class ForEachLoop {
    public static void main(String[] args) {
         /*For each loop
          Create an array for fruits & vegetables and print for every element in the array. "I love + name of thing" */
        //Used exclusively to loop through elements in an array
        String[] fruVeg = {"Apples", "Broccoli", "Strawberries", "Spinach", "Pears"};
        for(String favs : fruVeg) {
            System.out.println("I love " + favs);
        }
    }
}
