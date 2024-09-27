package com.pluralsight;

public class MathApp {
    //Display highest salary
    public static void main(String[] args) {
        int bobSalary = 60000;
        int garySalary = 50000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

    //Display lowest price
        int carPrice = 5000;
        int truckPrice = 10000;
        int smallestValue = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + smallestValue);


    /* Find & display area of circle whose radius is 7.25
        A = PI*r^2 */
        float circleRadius = 7.25F;
        double circleArea = Math.PI * circleRadius;
        System.out.println("The area of the circle is "+ circleArea);

    //Find & display square root of 5
        float x = 5.0F;
        double squareRoot = Math.sqrt(x);
        System.out.println("The square root of x is " + squareRoot);

    /*Find & display the distance between points (5,10) and (85,50)
      The distance formula is d = sqrt((x2 - x1)^2 + (y2 - y1))^2
      But Math.hypot is the same in Java written as Math.hypot(x2 - x1, y2 - y1); */
        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance);

    //Find & display absolute value of variable -3.8
        float var1 = -3.8F;
        System.out.println("The absolute value of -3.8 is " + Math.abs(var1));

    //Find & display a random number between 0 and 1
        double ran = Math.random();
        System.out.println("Your random number is "+ ran);

    }
}