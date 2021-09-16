package src.folowControl.switchStatement;

import java.util.Scanner;

/*Create a program which reads from the keyboard a number and displays the corresponding month of the
year. If the number is lower than 1 or bigger than 12, display an error message.
 */
public class WorkingWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number what correspond to a month of the year");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("Is january");
                break;
            case 2:
                System.out.println("Is february");
                break;
            case 3:
                System.out.println("Is march ");
                break;
            case 4:
                System.out.println("Is april");
                break;
            case 5:
                System.out.println("Is may");
                break;
            case 6:
                System.out.println("Is june");
                break;
            case 7:
                System.out.println("Is july");
                break;
            case 8:
                System.out.println("Is august");
                break;
            case 9:
                System.out.println("Is september");
                break;
            case 10:
                System.out.println("Is october");
                break;
            case 11:
                System.out.println("Is november");
                break;
            case 12:
                System.out.println("Is december");
                break;
            default:
                System.out.println("Unknown month!");
        }
    }
}
