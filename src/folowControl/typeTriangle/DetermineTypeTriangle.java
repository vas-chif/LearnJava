package src.folowControl.typeTriangle;

import java.util.Scanner;

//Write a Java program to check whether a triangle is equilateral, scalene or isosceles.
// Ask the user to provide the length of each side.
public class DetermineTypeTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sides of triangles: \n side a: ");
        int a = sc.nextInt();
        System.out.println("side b: ");
        int b = sc.nextInt();
        System.out.println("side c: ");
        int c = sc.nextInt();

        if ((a == b) && (a == c)) {
            System.out.println("This triangle is equilateral.");
        } else if ((a != b) && (a != c) && (b != c)){
            System.out.println("This triangle is scalene.");
        } else
            System.out.println("This triangle is isosceles.");
    }
}
