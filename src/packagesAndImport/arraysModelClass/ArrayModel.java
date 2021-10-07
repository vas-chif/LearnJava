package src.packagesAndImport.arraysModelClass;

import java.util.Arrays;
import java.util.Scanner;

/*
1. Create an Array class according to the model.
2. Create an instance of this class.
3. Implement and call the methods deﬁned in the model.
sum() - sums values of the array.
average() - calculates the average value of array elements.
even() - ﬁnds the number of even integers. Print them to the console.
odd() - ﬁnds the number of odd integers. Print them to the console.
length() - determines the length of the array.
 */
public class ArrayModel {
    Scanner sc = new Scanner(System.in);
    public int[] items;

    public void setItems() {
        items = new int [sc.nextInt()];
    }

    public void insertItemToArray() {
        Scanner scItem = new Scanner(System.in);
        for (int i = 0; i < items.length; i++) {
            System.out.print("Enter array's item: ");
            items[i] = scItem.nextInt();
        }
        System.out.println("Item array  is: " + Arrays.toString(items));
    }

    public void sumItems() {
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i];
        }
        System.out.println("The some items of the array is: " + sum);
    }

    public void averageItems() {
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i];
        }
        double average = (double) sum / items.length;
        System.out.println("The average ite of the array is: " + average);
    }

    public void evenItems() {
        int even = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0)
                even++;
        }
        System.out.println("The even items is: " + even);
    }

    public void oddItems() {
        int odd = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 != 0)
                odd++;
        }
            System.out.println("The odd items is: " + odd);
    }

    public void lengthItem() {
        System.out.println("The length of Items is: " + items.length);
    }
}
