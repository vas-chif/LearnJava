package src.folowControl.switchStatement;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        //It’s acceptable to deﬁne a single code block for multiple case labels in a switch statement.
        Scanner sc = new Scanner(System.in);
        System.out.println("If score is inferior to 10 enter 10, if score comprehended 0 to 50 enter 50, " +
                "if score comprehended 50 to 100 enter 100 and the score comprehended 100 to 200 enter 200.");
        System.out.println("Please enter your score" );
        int score = sc.nextInt();
        switch (score){
            case  10 :
                System.out.println("Low score");
                break;
            case  50 :
            case  100 :
                System.out.println("Average score!");
                break;
            case 200:
                System.out.println("Good score");
                break;
            default:
                System.out.println("You are entered the invalid score!");
        }
    }
}
