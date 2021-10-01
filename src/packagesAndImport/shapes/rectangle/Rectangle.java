package src.packagesAndImport.shapes.rectangle;

/*1. Create the Rectangle class according to the model.
2. Inside the calculateArea() method, after the computation,
print the result to the console.
3. Inside the calculatePerimeter() method, after the computation,
print the result to the console.
4. Create an instances of this class.
5. Ask the user to provide values for the length and width properties for both instances.
6. Call the calculateArea() and calculatePerimeter() method on both objects.
 */
public class Rectangle {
    public int length;
    public int width;

    public void calculateArea() {
        double rectangleArea = length * width;
        System.out.println("The area of the rectangle is: " + rectangleArea);
    }

    public void calculatePerimeter() {
        double rectanglePerimeter = Math.pow(length, 2) + Math.pow(width, 2);
        System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
    }
}
