package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) throws InterruptedException {
        int x = 0;
        do {
            System.out.println("I love Java");
            x++;
            Thread.sleep(1000);
        }
        while (x < 5);
    }
}
