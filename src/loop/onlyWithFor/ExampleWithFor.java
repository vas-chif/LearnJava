package src.loop.onlyWithFor;

import java.util.Scanner;

/*
Example whit  Loop For
 */
public class ExampleWithFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number integer: ");
        int userInput = sc.nextInt();
        // first example
        System.out.println("Multiplication with user input(first example): ");
        for (int i = 1; i < 5; i++) {
            System.out.print(userInput * i + " ");
        }
        System.out.println();
        // Second example
        System.out.println("Multiplication with user input (second example): ");
        for (int i = 1, j = 33; i < 5; i++) {
            System.out.print(userInput * i + "\n");
            System.out.println("Multiplication with j: " + j * i);
        }
        System.out.println();
        // third example
        System.out.println("Multiplication with input user (third example: ");
        for (int i = 1; i < 5; i++, printMethod()) {
            System.out.println("     " + userInput * i + " ");
        }
        System.out.println();
        // fourth example

        System.out.println("Using array string.");
        String[] names = {"Elina", "Mary", "Nasty", "Ste"};
        System.out.println("Print name: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        //using FOR EACH
        System.out.println();
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    // my first method
    private static void printMethod() {
        String mood = "Happy";
        /*
        acest "for" citeste depe variabila "mood" (ce inseamna - dispozitie, (statu d'animo)) ficare caracter
        - 1 iteratie extrage primul caracter "H"
        - 2 iteratie extrage al doliea caracter "a"
        - 3 iteratie extrage al treilea caracter "p"
        - 4 iteratie extrage al patrulea caracter "p"
        - 5 iteratie extrage al cincilea caracter "y"
         */
        for (int i = 0; i < mood.length(); i++) {
            System.out.println(mood.charAt(i));
        }
        System.out.println("I like learn java!");
    }
}
