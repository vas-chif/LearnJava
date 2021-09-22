package src.arrays;

import java.util.Arrays;

//5.3.5 Write a Java program to copy the elements of an array into another array.
public class CopyArray {
    public static void main(String[] args) {
        int[] sourceArray = {24, 6, 20, 87, 88, 16, 1, 3, 10};
        int[] targetArray = new int[sourceArray.length];

        System.out.println("Source Array " + Arrays.toString(sourceArray));
        System.out.println("Target array before to copy: " + Arrays.toString(targetArray)+ "\n");

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("Target array after copy: " + Arrays.toString(targetArray));
    }
}
