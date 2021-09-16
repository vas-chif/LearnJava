package src.folowControl.switchStatement;

import java.util.Scanner;

/*
Write a Java program that would take three inputs from the user: one arithmetic operator and two numbers.
It will then perform calculation based on numbers and the entered operator. Then the result is displayed in
the console.
 */
public class UsingOperatorsWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operators: +, -, *, / and % !");
        String operators = sc.next();
        System.out.println("Please enter two numbers: \n" + "First number");
        int firstNumber = sc.nextInt();
        System.out.println("Second number");
        int secondNumber = sc.nextInt();

        switch (operators) {
            case "+":
                System.out.println("The operation is addition: \n" + "The result is: " + ((double)firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("The operation is subtraction: \n" + "The result is: " + ((double)firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("The operation is multiplication: \n" + "The result is: " + (double)(firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("The operation is division: \n" + "Thr result is: " + ((double)firstNumber / secondNumber));
                break;
            case "%":
                System.out.println("The operation is modulus: \n" + "Thr result is: " + ((double)firstNumber % secondNumber));
                break;
            default:
                System.out.println("Wrong operation \n" + "The operator selected isn't indicated !!!!");
        }
    }
}
