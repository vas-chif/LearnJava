package src.scaner;

import java.util.Scanner;

public class WorkingWhitScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value integer: ");

        int userInput = sc.nextInt();

        System.out.println("User has entered the following value: " + userInput);

    }
}
