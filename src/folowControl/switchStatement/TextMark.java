package src.folowControl.switchStatement;
/*Create a Java program to display the "text mark" corresponding to a certain "numerical mark", using the
following equivalence:
9,10 = I’m proud of you!
7,8 = Very good!
6 = Good.
5 = Approved.
0-4 = Fail!
Your program must ask the user for a numerical mark and display the corresponding text mark.
Implement the solution for this exercise First by using the "if" construct, then using the "switch" statement.
 */

import java.util.Scanner;

public class TextMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter yur score up 1 to 10: ");
        int score = sc.nextInt();
        //° using the "if" construct
        if (score == 9 || score == 10)
            System.out.println("I'm proud of you!");
        else if (score == 7 || score == 8)
            System.out.println("Very Good!");
        else if (score == 6)
            System.out.println("Good !");
        else if (score == 5)
            System.out.println("Approved !");
        else if (score >= 0 && score <= 4)
            System.out.println("Fail !");
        else
            System.out.println("Wrong score entered!");
        System.out.println("Algorithm solved with if-else construct!\n");
        //°using the "switch" statement
        switch (score) {
            case 10:
            case 9:
                System.out.println("I'm proud of you !");
                break;
            case 8:
            case 7:
                System.out.println("Very good !");
                break;
            case 6:
                System.out.println("Good !");
                break;
            case 5:
                System.out.println("Approved !");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Fail !");
                break;
            default:
                System.out.println("Wrong score entered!");
        }
        System.out.println("Algorithm solved with switch statement!");
    }
}
