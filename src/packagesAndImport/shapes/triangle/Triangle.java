package src.packagesAndImport.shapes.triangle;
/*
Create a class Triangle with three attributes: p1, p2 and p3.
Each point (p1, p2, p3) represents the 2D coordinates of the
corners of the triangle.
Add a method to the Triangle class to determine its type: equilateral,isosceles or scalene.
d = V(x2 - x1)^2 + (y2 - y1)^2 '
 */


public class Triangle {

    public void determineType() {
        System.out.println("Enter the coordinate for points: "+ "\np1");
        PointOfTriangle p1 = new PointOfTriangle();
        System.out.println("p2");
        PointOfTriangle p2 = new PointOfTriangle();
        System.out.println("p3");
        PointOfTriangle p3 = new PointOfTriangle();

        double d1, d2, d3;
        d1 = Math.sqrt((Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2)));
        d2 = Math.sqrt((Math.pow((p2.x - p3.x), 2) + Math.pow((p2.y - p3.y), 2)));
        d3 = Math.sqrt((Math.pow((p3.x - p1.x), 2) + Math.pow((p3.y - p1.y), 2)));

        System.out.println("The distance is: ");
        System.out.println("d1: " + d1 + "; d2: " + d2 + "; d3: " + d3 + ";");

        System.out.print("It formed a triangle ");
        if ((d1 == d2) && (d1 == d3)) {
            System.out.println("equilateral.");
        } else if ((d1 != d2) && (d1 != d3) && (d2 != d3)) {
            System.out.println("scalene.");
        } else
            System.out.println("isosceles.");
    }
}
