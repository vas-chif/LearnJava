package src.packagesAndImport.points;

/*
Create a class Point with two attributes, x and y, and a method to determine to which quadrant of the
2D coordinate system this point belongs to. Print the result on the console.
 */
public class Point {
    public int x;
    public int y;

    public void determineQuadrant() {
        if (x > 0 && y > 0) {
            System.out.println("1° quadrant ");
        } else if (x < 0 && y > 0) {
            System.out.println("2° quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3° quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4° quadrant");
        } else {
            System.out.println("The point is positioned on one of the two abscissas");
        }
    }
}
