package src.packagesAndImport.arraysModelClass;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        ArrayModel items = new ArrayModel();

        System.out.print("Please enter the length to array: ");

       items.setItems();

        items.insertItemToArray();

        items.sumItems();

        items.averageItems();

        items.evenItems();

        items.oddItems();

        items.lengthItem();
    }
}
