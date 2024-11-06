package com.pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //1: Create a List of Integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //Use the Stream API to filer out even numbers, square each remaining number (map), collect to get results in a new list or use toList()
        List<Integer> result = numbers.stream()
                                      .filter(nr -> nr % 2 != 0)
                                      .map(nr -> nr * nr)
                                      .collect(Collectors.toList());

        System.out.println(result);
    }
}
