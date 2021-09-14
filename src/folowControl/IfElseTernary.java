package src.folowControl;

import java.util.Scanner;

/* Create a program which reads from the keyboard two numbers and prints to the console the biggest one.
   Implement the solution using:
*/

public class IfElseTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter tow numbers for compare: ");
        System.out.println("First number: ");
        int a = sc.nextInt();
        System.out.println("Second number: ");
        int b = sc.nextInt();

        //● if-else construct
        if (a > b)
            System.out.println("The number biggest is : " + a + " Verified with if-else construct!");
        else
            System.out.println("The number biggest is : " + b + " Verified with if-else construct!");

        //● ternary construct
        int biggest = (a > b) ? a : b;
        System.out.println("The number biggest is : " + biggest + " Verified with ternary construct!");
    }
}
