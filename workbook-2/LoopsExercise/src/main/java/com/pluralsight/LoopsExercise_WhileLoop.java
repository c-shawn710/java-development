package com.pluralsight;

public class LoopsExercise_WhileLoop {
    public static void main(String[] args) {

        /*While Loop
          Write a loop that prints "Hi" + the number of times the loop has been running, until a
          Math.random() generates a value under 0.05 */
        boolean hi = false;
        int counter = 0;
        while (!hi) {
            System.out.println("Hi " + counter++);
            if (Math.random() < 0.05) {
                hi = true;
            }
        }
    }
}