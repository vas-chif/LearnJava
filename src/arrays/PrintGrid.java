package src.arrays;
/* Write a Java program to print the following grid:
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
 */

import java.util.Arrays;

public class PrintGrid {
    public static void main(String[] args) {
        char[][] grid = new char[10][10];
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++)

            System.out.print(" - ");

            System.out.println();
        }
    }
}

