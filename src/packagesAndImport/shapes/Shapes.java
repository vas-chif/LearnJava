package src.packagesAndImport.shapes;
/*1. Create the Shape class according to the model.
2. Create an instances of this class.
3. Create an instance of Circle class and deﬁne the value for the
radius property.
4. Set the Circle object on the appropriate ﬁeld of the Shape instance.
5. Create an instance of Rectangle class and deﬁne the values for
length and width properties.
6. Set the Rectangle object on the appropriate ﬁeld of the Shape instance.
7. Call the calculateArea() method of the circle attribute
 and calculatePerimeter(),calculateArea() methods of the rectangle attribute.
 */
import src.packagesAndImport.shapes.circle.Circle;
import src.packagesAndImport.shapes.rectangle.Rectangle;
import src.packagesAndImport.shapes.triangle.Triangle;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Working wit circle.");
        Circle circle = new Circle();
        System.out.print("Please enter length of radius: ");
        circle.radius = sc.nextInt();
        circle.calculateArea();

        System.out.println("\nWorking wit rectangle.");
        Rectangle rectangle = new Rectangle();
        System.out.print("Please enter length of rectangle: ");
        rectangle.length = sc.nextInt();
        System.out.print("Please enter width of radius: ");
        rectangle.width = sc.nextInt();
        rectangle.calculatePerimeter();
        rectangle.calculateArea();

        System.out.println("\nWorking wit triangle.");
        Triangle triangle = new Triangle();
        triangle.determineType();
    }
}
