package polyMiniExercise;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void calculateArea() {
        System.out.println("Calculating area... ");
    }

    public void calculateCircumference() {
        System.out.println("Calculating circumference... ");
    }

    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Square( 5);
        Shape s3 = new Circle( 5);

    // set the fields and call the methods for calculating on each
    // can you print the radius of the circle? access in here, not in circle
    // can you print the side size of the square?

        s1.getColor();
        s2.calculateArea();
        s3.calculateCircumference();

        //casting
        System.out.println(((Circle) s3).getRadius());
        System.out.println(((Square) s2).getSideSize());

        //safer way
        if(s3 instanceof Circle c) {
            System.out.println(c.getRadius());
        }
    }
}
