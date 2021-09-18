package src.loop.onlyWithFor;

import java.util.Scanner;

/*Create a program which reads from the keyboard a positive number and displays in the console all the
        numbers that are smaller than the one you inserted, but bigger than 0 (zero) and divisible by 2.
 */
public class AnotherLopFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number integer: ");
        int userInput = sc.nextInt();

        for (int i = 0; i <= userInput; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
