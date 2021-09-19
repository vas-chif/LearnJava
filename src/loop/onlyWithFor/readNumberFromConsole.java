package src.loop.onlyWithFor;

import java.util.Scanner;

/*
Write a program which reads a number from the console until the user enters the number 0 (zero)
using the for loop.
 */
public class readNumberFromConsole {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.print("Pleas enter first number: ");

        int userInput = sc.nextInt();

        for (int i = 0; userInput != 0; i++) {
            System.out.print("Enter another number: ");
            userInput = sc.nextInt();
            count++;
        }
        System.out.println("You are entered " + count + " numbers.");
    }

    private static void readNumberFromConsole() {

    }
}
