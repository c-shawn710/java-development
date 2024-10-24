package MethodsMiniExercises;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Hatchet", "Gary Paulsen", 4.99, 97814169, true);
        System.out.println(book.bookDetails());
        book.bookDetails(20, "2024-10-20", "2024-10-30");

        Dog dog = new Dog("Miso", "Maltipoo", "Ruff Ruff!", true);
        System.out.println(dog.bark());
        dog.walk("Shawn");
        dog.walk();
        dog.walk("I", 60);
        dog.walk();

        Product product = new Product("65-BLA-909f", "Lamp", "303a");
        product.order(2);
    }
}
