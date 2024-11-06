package com.pluralsight;

public class LambdaExample {
    public static void main(String[] args) {
        //1. Lambda expression to implement Functional Interface to perform addition
        NumericOperator addition = (a, b) -> a + b;

        int result = addition.operate(1, 1);
        System.out.println("1: " + result);

        //2. Lambda expression to find the maximum of two integers
        NumericOperator maxValue = (a, b) -> Math.max(a, b);

        int result2 = maxValue.operate(1, 3);
        System.out.println("2: " + result2);

        //3. Implement StringFormatter interface using lambda expression to convert a string to uppercase
        StringFormatter uppercase = str -> str.toUpperCase();

        //Use the lambda expression to convert a string to uppercase
        String original = "hello";
        String lambda = uppercase.format(original);
        System.out.println("3: " + lambda);

        //4. Bonus exercises
        //Implement UnaryOperator interface using lambda expression to compute the square of an int
        UnaryOperator unaryOperator = x -> (int)Math.pow(x, 2); //or can just do x * x

        //Use lambda expression to compute print the square of an integer
        int integer = 5;
        int unaryResult = unaryOperator.apply(integer);
        System.out.println("4: " + unaryResult);

        //5. Implement TriFunction interface using lambda expression to compute and print the average of three integers
        TriFunction avgFunction = (a, b, c) -> (a + b + c) / 3;

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int average = avgFunction.apply(num1, num2, num3);
        System.out.println("5: " + average);

        //6. Implement the Printer interface using a lambda expression to print a string to the console
        Printer printer = str -> System.out.println(str);
        printer.print("6: hi");

        //7. Create a generic functional interface named Predicate<T> that tests an object of type T
    }
}
