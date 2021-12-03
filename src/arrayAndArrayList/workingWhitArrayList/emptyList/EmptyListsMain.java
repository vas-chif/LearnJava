package src.arrayAndArrayList.workingWhitArrayList.emptyList;

import java.util.ArrayList;

public class EmptyListsMain {
    public static void main(String ... args) {

        ArrayList<String> anyList = new ArrayList<>();
        anyList.add("Apples");
        anyList.add("Grapefruit");
        anyList.add("Pineapple");
        System.out.println("Any list: " + anyList);

        EmptyLists el = new EmptyLists();
        System.out.println("Using method clear. " + el.listToClear(anyList) );
        System.out.println("Using loop and method remove" + el.listToClearUsingLoop(anyList));

    }
}
