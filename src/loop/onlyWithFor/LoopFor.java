package src.loop.onlyWithFor;

import java.util.Scanner;

/*
Create a program which reads from the keyboard a positive number and displays in the console all the
numbers that are smaller than the one you inserted, but bigger than 0 (zero).
Display the numbers in the ascending order, then in descending order.
 */
public class LoopFor {
    public static void main(String[] args) {
        //reads from the keyboard a positive number
        Scanner sc = new Scanner(System.in);
        System.out.print("Please entre a number integer: ");
        int userInput = sc.nextInt();
        System.out.println("");
        System.out.println("Loop with increased count: ");
        for (int i = 1; i < userInput; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Loop with decreased count: ");
        for (int i = userInput - 1; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
