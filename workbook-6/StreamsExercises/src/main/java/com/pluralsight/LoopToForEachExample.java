package com.pluralsight;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        //4: Create a List of Strings
        List<String> string = Arrays.asList("Hello", "Goodbye", "See ya later", "Sup", "Blarggg");

        /* Consider the following for loop:
                for (String s : strings) {
                  System.out.println(s);
                }
        //Replace the for loop with the forEach method and a lambda expression.*/

        string.forEach(s -> System.out.println(s));
    }
}
