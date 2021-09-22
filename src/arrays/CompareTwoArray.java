package src.arrays;

/*
Write a Java program to check if two arrays are equal: check both the length and the values.
 */
public class CompareTwoArray {
    public static void main(String[] args) {

        int[] originalArray = {1, 3, 5, 2, 4, 6};
        int[] compareArray = {1, 3, 5, 2, 4, 6};

        boolean compareItem = false;

        if (originalArray.length == compareArray.length) {

            System.out.println("\nThe length of all array is equals: " + originalArray.length + "\n");

            int count = 0;
            for (int i = 0, j = 0; i < originalArray.length; i++, j++) {

                if (originalArray[i]== compareArray[j]) {
                    compareItem = true;

                } else if (originalArray[i] != compareArray[j]){
                    compareItem = false;
                    break;
                }
            }
            System.out.println(compareItem? "The array is equals." : "The array is not equals.");
        }
        else {
            System.out.println("\nThe length of the Array is not equal so it does not satisfy the conditions" +
                    " and the execution of the program stops there.");
        }
    }
}
