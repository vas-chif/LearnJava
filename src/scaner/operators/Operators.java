package src.scaner.operators;

import java.util.Scanner;
// Write a Java program that accepts two integers from the user and then prints:

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two number integers: ");
        int firstNumber = sc.nextInt();
        int secondNumbers = sc.nextInt();
        //1. the addition
        int addition = firstNumber + secondNumbers;
        System.out.println("The addition of numbers: " + addition);
        // 2. the subtraction
        int subtraction = firstNumber - secondNumbers;
        System.out.println("The subtraction of numbers: " + subtraction);
        // 3. multiplication
        int multiplication = firstNumber * secondNumbers;
        System.out.println("The multiplication of numbers: " + multiplication);
        // 4. the division
        int division = firstNumber / secondNumbers;
        System.out.println("The division of numbers: " + division);
        //5. the average
        int average = (firstNumber + secondNumbers) / 2;
        System.out.println("The average of numbers: " + average);
        //6. the remainder
        int remainders = firstNumber % secondNumbers;
        System.out.println("The remainders of numbers: " + remainders);
    }
}
