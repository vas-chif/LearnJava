package src.exceptions;
/*
Create the class ListIntReader which will read from the console a list of numbers split by comma and
store all numbers in a list of type Integer. If a number couldn’t be parsed from String to Integer
display the corresponding message and continue with rest of the numbers from the list.
Input example: "1,23,4 ,5 , 6, k, d, 9, 8"
Create the class ListIntReaderTestwhich instantiates the class ListIntReader, and calculates the
sum of the numbers which have been successfully parsed to a number type.
 */

import java.util.ArrayList;

public class ListIntReader {

    public int parse(String input) {
        ArrayList<Integer> parseNumber = getNumber(input);

        return sum(parseNumber);
    }

    // Split and convert String in Integer
    private ArrayList<Integer> getNumber(String input) {
        //Input example: "1,23,4 ,5 , 6, k, d, 9, 8"
        // Split String
        ArrayList<Integer> numbers = new ArrayList<>();
        // metoda split face parte din String Class si divide Stringul in parti, indicând un simbol de la care sa divida sau un caracter.
        String[] parts = input.split(",");
        //Convert String in Integer
        for (String part : parts) {
            try {
                int converted = Integer.parseInt(part.trim());
                numbers.add(converted);
            } catch (NumberFormatException ex) {
                System.out.println(String.format("Could not parse input value [%s] to an Integer", part));
            }
        }
        return numbers;
    }

    private int sum(ArrayList<Integer> numbers) {
        int result = 0;
        for (Integer num : numbers) {
            result += num;
        }
        return result;
    }
}
