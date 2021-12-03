package src.arrayAndArrayList.workingWithArrays;

/*
5.3.1 Write a Java program to sum values of an array two dimensional array.
5.3.2 Write a Java program to calculate the average value of array elements two dimensional array.
 */
public class SomeItem2DimensionalArray {
    public static void main(String[] args) {

        int[][] beDimensionalArray = {{1, 2, 3}, {2, 4}};

        int some = 0;

        int count = 0;//total index

        for (int i = 0; i < beDimensionalArray.length; i++) {

            for (int j = 0; j < beDimensionalArray[i].length; j++) {

                some = some + beDimensionalArray[i][j];
                count++;

            }
        }
       // System.out.println(count);
        double average = (double) some / count;

        System.out.println("The result of the sum of the array index is: " + some + "\n");

        System.out.println("The result of the average of the array index is: " + average);
    }
}
