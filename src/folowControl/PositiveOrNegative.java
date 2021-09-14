package src.folowControl;

import java.util.Scanner;

// Write a Java program to get a number from the user and print whether it is positive or negative whit:
//● if-else construct
// ● ternary construct
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please ante a number: ");
        int userInput = sc.nextInt();
        // if-else construct
        if (userInput > 0) {
            System.out.println("if else construct\n" +"The number entered is positive");
        } else
            System.out.println("if else construct\n" +"The number entered is negative or equals '0'");
        // ternary construct
        String number = (userInput > 0) ? "Ternary construct\n The number entered is positive" : "Ternary construct\n The number is negative or equals '0'";
        System.out.println(number);
    }
}
