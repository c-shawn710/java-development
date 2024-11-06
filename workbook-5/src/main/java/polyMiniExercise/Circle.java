package polyMiniExercise;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    @Override
    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle: " + circumference);
    }
}
