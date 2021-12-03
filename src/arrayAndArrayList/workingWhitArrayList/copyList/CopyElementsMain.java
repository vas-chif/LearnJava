package src.arrayAndArrayList.workingWhitArrayList.copyList;

import java.util.ArrayList;

public class CopyElementsMain {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        System.out.println("My lists: " + myList);

        ArrayList<String> listToCopied = new ArrayList<>();
        listToCopied.add("four");
        listToCopied.add("five");
        listToCopied.add("six");
        System.out.println("List to copied: " + listToCopied);

        CopyElements ce = new CopyElements();
        System.out.println("Copied whit method addAll: " + ce.copiedElements(myList, listToCopied));

        System.out.println("Copied whit using loop: " + ce.copiedElementsUsingLoop(myList, listToCopied));


    }
}
