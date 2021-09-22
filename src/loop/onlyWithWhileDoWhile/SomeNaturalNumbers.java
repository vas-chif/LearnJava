package src.loop.onlyWithWhileDoWhile;

/*
Write a program to compute the sum of natural numbers within the range from 1 to 100 using while
or do-while constructs.
 */
public class SomeNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("This programme calculate the sum natural number of 0 to 100 and show the sum on the console!");

        someNaturalNumberDoWhile();

        System.out.println();

        someNaturalNumberWhile();
    }

    // my second method
    private static void someNaturalNumberDoWhile() {
        int number = 0;
        int sume = 0;
        do {
            sume += number;
            number++;
        } while (number <= 100);
        System.out.println("The sum numbers of 0 to 100 is: " + sume + " using method 'do - while'.");
    }

    // my third method
    private static void someNaturalNumberWhile() {
        int number = 0;
        int sume = 0;
        while (number <= 100) {
            sume += number;
            number++;
        }
        System.out.println("The sum numbers of 0 to 100 is: " + sume + " using method 'while'.");
    }
}
