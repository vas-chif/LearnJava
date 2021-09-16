package src.folowControl.switchStatement;
/*Write a Java program that reads a number from the console and displays the name of the weekday. If the
number is lower than 1 or bigger than 7, display an error message.
° using switch statement
° using if-else
 */

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number what correspond a day of the week: ");
        int day = sc.nextInt();
        System.out.println("");
        //° using switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error message\n" + "Unknown day!!!???????");
        }
        System.out.println("Algorithm solved with Switch statement\n");

        //° using if-else
        if (day == 1)
            System.out.println("Monday");
        else if (day == 2)
            System.out.println("Tuesday");
        else if (day == 3)
            System.out.println("Wednesday");
        else if (day == 4)
            System.out.println("Thursday");
        else if (day == 5)
            System.out.println("Friday");
        else if (day == 6)
            System.out.println("Saturday");
        else if (day == 7)
            System.out.println("Sunday");
        else
            System.out.println("Error message\n" + "Unknown day!!!!????!!!");
        System.out.println("Algorithm solved with if-else construct");
    }
}
