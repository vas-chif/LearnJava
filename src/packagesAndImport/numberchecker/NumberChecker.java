package src.packagesAndImport.numberchecker;

import java.util.Scanner;

/*
Create a method that receives a number as input and indicates whether it is positive or negative by
returning a boolean.
 */
public class NumberChecker {
    Scanner sc = new Scanner(System.in);

    int userInput = sc.nextInt();

    // with user input
    public void checker() {
        boolean k = (userInput > 0) ? true : false;
        System.out.println("Is positive? " + k);
    }
// wit boolean return using follow control if-else

    public boolean isPositive(int numberToCheck) {
        if (numberToCheck > 0)
            return true;
        else
            return false;
    }

    // wit boolean return using follow control ternary
    public boolean ternaryIsPositive(int numberToCheck) {
        return (numberToCheck > 0) ? true : false; //este echivalent la retunul de jos
       // return numberToCheck > 0;
    }
}
