package com.pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        //3: Create a List of Strings
        List<String> str = Arrays.asList("Hello", "Goodbye", "See ya later", "Sup", "Blarggg");

        //Use the stream API to filter out strings with fewer than 6 characters, convert them to uppercase, and collect the results in a new list
        List<String> result = str.stream()
                                 .filter(word -> word.length() > 6)
                                 .map(String::toUpperCase) //lambda would be .map(word -> word.toUpperCase()
                                 .collect(Collectors.toList());
        //if you want to have it print in one line use .toList on line 16

        System.out.println(result);
    }
}
