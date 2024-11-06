package com.pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        //2: Create a List of Integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Use the stream API to count the number of even numbers in the list
        List<Integer> result = numbers.stream()
                                      .filter(nr -> nr % 2 == 0)
                                      .collect(Collectors.toList());
        System.out.println(result);
    }
}
