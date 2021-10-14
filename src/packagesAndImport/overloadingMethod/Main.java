package src.packagesAndImport.overloadingMethod;

public class Main {
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram();
        int rectanglePerimeter = parallelogram.calculatePerimeter(1, 4);
        System.out.println("Perimeter of the rectangle is: " + rectanglePerimeter);

        double rectangleArea = parallelogram.calculateArea(3,5d);
        System.out.println("Area of the rectangle is: " + rectangleArea);

        int squarePerimeter = parallelogram.calculatePerimeter(4);
        System.out.println("Perimeter of the square is: " + squarePerimeter);

        int squareArea = parallelogram.calculateArea(5);
        System.out.println("Area of the square is: " + squareArea);
    }
}
