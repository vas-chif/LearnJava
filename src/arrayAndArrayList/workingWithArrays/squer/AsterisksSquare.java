package src.arrayAndArrayList.workingWithArrays.squer;

import java.util.Scanner;

public class AsterisksSquare {
    public void squareOfAsterisks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the sides of the square: ");
        int userInput = sc.nextInt();
        char[][] square = new char[userInput][userInput];
        for (int i = 0; i < userInput; i++) {

            for (int j = 0; j < userInput; j++)

                System.out.print(" * ");

            System.out.println();
        }
    }
}
