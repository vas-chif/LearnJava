package src.packagesAndImport.shapes.rectangle;

import java.util.Scanner;

/*1. Create the Rectangle class according to the model.
2. Inside the calculateArea() method, after the computation,
print the result to the console.
3. Inside the calculatePerimeter() method, after the computation,
print the result to the console.
4. Create an instances of this class.
5. Ask the user to provide values for the length and width properties for both instances.
6. Call the calculateArea() and calculatePerimeter() method on both objects.
 */
public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Please enter width of the rectangle: ");
        rectangle.width = sc.nextInt();
        System.out.println("Please enter length of the rectangle: ");
        rectangle.length = sc.nextInt();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

    }
}
