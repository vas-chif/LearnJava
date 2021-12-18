package src.inheritance.shape;

public class Cube extends ThreeDimensionalShape{
    private int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength,2) * 6;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength,3);
    }
}
