package src.arrayAndArrayList.workingWhitArrayList.reverse;
// 12.2.5Write a method reverse that reverses each String element from an ArrayList.

import java.util.ArrayList;


public class ListReverser {

    ArrayList<String> listToRevers(ArrayList<String> inputList) {

        ArrayList<String> reversedList = new ArrayList<>();

        for (String element : inputList) {

            reversedList.add(new StringBuilder(element).reverse().toString());

        }
        return reversedList;

    }

    ArrayList<String> reversItem(ArrayList<String> list) {

        int count = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(count));
            count--;
        }

        return list;
    }
}
