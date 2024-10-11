package com.pluralsight;

public class LoopsExercise_ForLoop {
    public static void main(String[] args) {

    /*For loop
          Print the even numbers under 20 using a for loop*/
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {       //"if i is divided by 2 and the remainder equals 0"
                System.out.println(i);
            }
        }
    }
}
