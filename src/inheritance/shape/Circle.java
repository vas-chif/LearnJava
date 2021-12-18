package src.inheritance.shape;

public class Circle extends TwoDimensionalShape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI* Math.pow(radius, 2);
    }
}
