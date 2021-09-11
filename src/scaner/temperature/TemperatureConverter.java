package src.scaner.temperature;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This program converts the temperature from Celsius in Fahrenheit and vice versa.");
        System.out.print("Please selection of what type your measurement is °C or °F (select 1 for °C and 2 for °F): ");

        int userSelect = sc.nextInt();

        if (userSelect == 1) {
            System.out.println("You are select °C." + "Please enter the temperature: ");
            int userInputC = sc.nextInt();
            int fahrenheit = (9 * userInputC + (32 * 5)) / 5;
            System.out.println("The temperature in °F: " + fahrenheit + ". Thank you for using this program!");

        } if (userSelect == 2) {
            System.out.println("You are select °F. " + "Please enter the temperature: ");
            int userInputF = sc.nextInt();
            int celsius = (5 * (userInputF - 32)) / 9;
            System.out.println("The temperature in °C: " + celsius + ". Thank you for using this program!");
        } else
            System.out.println("You are created an exception!");

    }
}
