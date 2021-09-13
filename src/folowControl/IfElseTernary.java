package src.folowControl;

import java.util.Scanner;

/* Create a program which reads from the keyboard two numbers and prints to the console the biggest one.
   Implement the solution using:
*/

public class IfElseTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter tow numbers for compare: ");
        int firstInput = sc.nextInt();
        int secondInput = sc.nextInt();

        //● if-else construct
        if (firstInput > secondInput)
            System.out.println("The number biggest is : " + firstInput + " Verified with if-else construct!");
        else
            System.out.println("The number biggest is : " + secondInput + " Verified with if-else construct!");

        //● ternary construct
        int biggest = (firstInput > secondInput) ? firstInput : secondInput;
        System.out.println("The number biggest is : " + biggest + " Verified with ternary construct!");
    }
}
