package polyMiniExercise;

public class Square extends Shape {
    private double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public void calculateArea() {
        double area = sideSize * sideSize;
        System.out.println("Area of square: " + area);
    }
}
