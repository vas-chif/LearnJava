package src.arrays;

/*
Working with arrays
1. Declare an array of type int.
2. Allocate memory for this array.
3. Initialize the array.
4. Print the array to the console.
5. Repeat 1, 2 and 3 by combining the declaration, allocation and initialization of the array in one
statement.
6. Print the array to the console.
 */
public class WorkWithArray {
    public static void main(String[] args) {
        // 1. Declare an array of type int.
        int[] firstArray;
        // 2. Allocate memory for this array.
        firstArray = new int[8];
        // 3. Initialize the array.
        int index = 0;
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 5;
            System.out.print("Index: " + index + " = " + firstArray[i] + ", ");
            index++;
        }
 /*       // 4. Print the array to the console.
        for (int str : firstArray) {
            System.out.print("Index: " + index + " = " + str + ", ");
        }
 */
        System.out.println();
        // 5. Repeat 1, 2 and 3 by combining the declaration, allocation and initialization of the array in on statement.
        int[] secondArray = {88, 87, 16, 22};
        // 6. Print the array to the console.
        int indexSecond = 0;
        for (int str : secondArray) {
            System.out.print("Index: " + indexSecond + " = " + str + ", ");
            indexSecond++;
        }
    }
}
