package src.exceptions.trowException;

public class DivisibleBy7Main {
    public static void main(String[] args) {

        DivisibleBy7 divisible = new DivisibleBy7();

        try {
           int count = divisible.countDivisibleBy7(4, 99);
            System.out.println(count);
        } catch (InvalidRangeException e) {
            e.printStackTrace();
        }


        try {
           int count = divisible.countDivisibleBy7(99, 4);
            System.out.println(count);
        } catch (InvalidRangeException e) {
            e.printStackTrace();
        }
    }
}
