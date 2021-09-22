package src.arrays;

/*
5.3.1 Write a Java program to sum values of an array (do it with one & two dimensional array). //ok
   *****The solution for this exercise found in the class "SomeItemArray" and "SomeItem2DimensionalArray".*****
5.3.2 Write a Java program to calculate the average value of array elements (do it with one & two
dimensional array).                                                                             // ok
    *****The solution for this exercise found in the class "SomeItemArray" and "SomeItem2DimensionalArray".*****

5.3.3 Write a Java program to test if an array contains a speciﬁc value.                         //ok
5.3.4 Write a Java program to ﬁnd the index of an array element.                                 // ok
      *****The solution for this exercise found in the class "FindIndexArray"*********
5.3.5 Write a Java program to copy the elements of an array into another array.                 // ok
      *****The solution for this exercise found in the class "CopyArray".*******
5.3.6 Write a Java program to ﬁnd the number of even and odd integers in a given array of integers. //ok
5.3.7 Write a Java program to check if two arrays are equal: check both the length and the values.
     ***********The solution for this exercise found in the class "CompareTwoArray".********
 */
public class OperationsWithIndexArray {

    public static void main(String[] args) {

        int[] someNumbers = {4, 5, 7, 9, 8, -9, 20, 24};

//5.3.3 Write a Java program to test if an array contains a speciﬁc value.
        System.out.println("Ex. 5.3.3");

        int search = 3;

        boolean found = false;

        for (int element : someNumbers) {

            if (element == search) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found it!!!" : "Could not find anything!!");

//5.3.6 Write a Java program to ﬁnd the number of even and odd integers in a given array of integers.
        System.out.println("Ex. 5.3.6");

        int evenNumbers = 0;
        // firs example how solve this problem

        for (int i = 0; i < someNumbers.length; i++) {

            if (someNumbers[i] % 2 == 0)
                evenNumbers++;
        }

        System.out.println("First example\n" + "The even numbers is: " + evenNumbers + "\nThe odd numbers is: " +
                (someNumbers.length - evenNumbers));

        //second example how solve this problem
        int oddNumbers = 0;

        for (int item : someNumbers) {

            if (item % 2 != 0) {      //if (item % 2 == 1 || item % 2 == -1)
                oddNumbers++;
            }
        }

        System.out.println("Second example\n" + "The even numbers is: " + evenNumbers + "\nThe odd numbers is: " +
                oddNumbers);
    }
}
