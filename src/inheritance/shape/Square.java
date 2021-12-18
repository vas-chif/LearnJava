package src.inheritance.shape;

public class Square extends TwoDimensionalShape {

    private final int sideLength;


    public Square(int width) {
        this.sideLength = width;

    }


    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
