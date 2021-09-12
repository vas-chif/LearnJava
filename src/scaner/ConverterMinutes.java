package src.scaner;

import java.util.Scanner;

// Write a Java program to convert minutes into:
public class ConverterMinutes {
    public static void main (String... args){
//        Ask the user to input the minutes.

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the minute to convert: ");
        int minuteToCovert = sc.nextInt();

        int minutesInAnHour = 60;
       // double hour = minuteToCovert / minutesInAnHour;
        int hourInADay = 24;
        int minInADay = hourInADay * minutesInAnHour;
        int days = minuteToCovert / minInADay;
        int dayInAYear = 365;
        int minInAYear = minInADay * dayInAYear;
        int years = minuteToCovert / minInAYear;

//                Print the result to the console.
//        1.  a number of years;
//        2. a number of days.

        System.out.println("Number of Years: " + years);
        System.out.println("Number of Days: " + days);


    }
}
