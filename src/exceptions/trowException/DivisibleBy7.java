package src.exceptions.trowException;
/*
Write a program that counts how many numbers that are divisible by 7 exist between a minimum and a
maximum value provided by the user.
If the minimum value is greater than or equal to maximum value, the program should throw an
InvalidRangeException and handle it to display a message to the user on the following format:
Invalid range: minimum is greater than or equal to maximum
 */

public class DivisibleBy7 {
    int countDivisibleBy7(int start, int end) throws InvalidRangeException {
        if (start >= end) {
            // trow exception
            InvalidRangeException exception = new InvalidRangeException("Invalid range: minimum is greater than or equal to maximum");
            throw exception;
            // la linia 17 este simplificat codul della linia 14 si 15, si este acela lucru
           // throw new InvalidRangeException("Invalid range: minimum is greater than or equal to maximum");
        }

        int count = 0;
        for (int index = start; index < end; index++) {
            if (index % 7 == 0) {
                count++;
            }
        }
        return count;
    }

}
