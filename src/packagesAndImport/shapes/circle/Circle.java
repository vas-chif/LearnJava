package src.packagesAndImport.shapes.circle;

public class Circle {
    int radius;

    void calculateArea() {
        //double circleArea = Math.PI * radius * radius;
        double circleArea = Math.PI * Math.pow(radius, 2); //alternativa la sirul de mai sus (sint echivalente)
        System.out.println("The area of the circle is; " + circleArea);
    }
}
