package src.arrayAndArrayList.workingWithArrays;
/* Write a Java program to print the following grid:
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
 */

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

