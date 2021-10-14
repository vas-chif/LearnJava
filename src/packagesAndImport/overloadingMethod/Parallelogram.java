package src.packagesAndImport.overloadingMethod;

public class Parallelogram {
    public int calculatePerimeter(int length, int width) {
        return (length + width) * 2;
    }

    public int calculatePerimeter(int sideLength) {
        return sideLength * 4;
    }

    public double calculateArea(int length, double width) {
        return length * width;
    }

    public int calculateArea(int sideLength) {
        return sideLength * sideLength;
    }
}
