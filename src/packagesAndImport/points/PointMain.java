package src.packagesAndImport.points;

import java.util.Scanner;

public class PointMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point point = new Point();
        System.out.print("Please enter the coordinate for x: ");
        point.x = sc.nextInt();
        System.out.print("Please enter the coordinate for y: ");
        point.y = sc.nextInt();
        point.determineQuadrant();
    }
}
