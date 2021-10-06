package src.packagesAndImport.numberchecker;

public class NumberCheckerMain {
    public static void main(String[] args) {
        System.out.print("Please enter a integer number: ");
        NumberChecker number = new NumberChecker();
        number.checker();

        boolean result = number.isPositive(4);
        System.out.println("Is positive ? " + result);

        boolean result2 = number.ternaryIsPositive(-6);
        System.out.println("the number is positive? " + result2);

    }
}
