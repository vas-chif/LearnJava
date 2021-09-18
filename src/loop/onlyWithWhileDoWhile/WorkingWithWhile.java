package src.loop.onlyWithWhileDoWhile;

import java.util.Scanner;

/*Write a program which reads numbers from the console until the user enters 0 (zero). Display in the console
the amount of entered numbers (how many). Compute and display their sum in the console.
 */
public class WorkingWithWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number: ");

        int count = 0;
        int some = 0;
        int userInput = sc.nextInt();

        while (userInput != 0) {
            some += userInput; // ex: some = some + userNumber;
            count++;
            System.out.print("Enter another number: ");
            userInput = sc.nextInt();
        }
        System.out.println("You are entered " + count + " numbers!");
        System.out.println("Some is: " + some);

    }
}
