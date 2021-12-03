package src.arrayAndArrayList.workingWithArrays.squer;

import java.util.Scanner;

public class AnyCharacterSquare {

    public void squareOfAnyCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the side of the square: ");
        int side = sc.nextInt();

        System.out.print("Please enter the character to printed: ");
        char character = sc.next().charAt(0);

        char [][] square = new char[side][side];

        for (int i = 0; i < side; i++) {

            for (int j = 0; j < side; j++)

                System.out.print(" " + character + " ");

                System.out.println();

        }
    }
}
