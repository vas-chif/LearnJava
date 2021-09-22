package src.arrays;

/*
5.3.1 Write a Java program to sum values of an array.
5.3.2 Write a Java program to calculate the average value of array elements.
 */
public class SomeItemArray {
    public static void main(String[] args) {

        int[] oneDimensionalArray = {1987, 1988, 2016, 2022};

        int some = 0;

        for (int i = 0; i < oneDimensionalArray.length; i++) {

            some += oneDimensionalArray[i];

        }

        System.out.println("The result of the sum of the array index is: " + some + "\n");

        double average = (double) some / oneDimensionalArray.length;

        System.out.println("The result of the average of the array index is: " + average);
    }
}
