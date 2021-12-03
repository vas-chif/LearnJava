package src.arrayAndArrayList.workingWhitArrayList.reverse;

import java.util.ArrayList;

public class ReverseMain {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("ioKlmN");
        myList.add("!^ì");
        System.out.println(myList);

        ArrayList<String> reverseList = new ArrayList<>();
        ListReverser lr = new ListReverser();
        reverseList = lr.listToRevers(myList);
        System.out.println(reverseList);

       // System.out.println(lr.reversItem(reverseList));


    }
}
