package src.folowControl.switchStatement;

import java.util.Scanner;
import java.util.SortedMap;

//Comparing a switch Statement with Multiple if-else Constructs
public class SwitchIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the weekday, using the abbreviation first 3 letters");
        String day = sc.next();
        System.out.println(" ");
        //° using if-else construct
        if (day.equals("Mon") || day.equals("Tue") || day.equals("Wed")) {
            System.out.println("Time to work");
        }
        else if (day.equals("Thu") || day.equals("Fri")) {
            System.out.println("Nearing weekend");
        }
        else if (day.equals("Sat") || day.equals("Sun")) {
            System.out.println("Weekend!");
        }
        else {
            System.out.println("Invalid day.");
        }
        System.out.println("Algorithm solved with if-else");
        System.out.println("");
        //° using switch statement
        switch (day) {
            case "Mon":
            case "Tue":
            case "Wed":
                System.out.println("Time to work");
                break;
            case "Thu":
            case "Fri":
                System.out.println("Nearing weekend");
                break;
            case "Sat":
            case "Sun":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day.");
        }
        System.out.println("Algorithm solved with switch");

    }
}
