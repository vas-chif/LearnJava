package src.arrayAndArrayList.workingWhitArrayList.compares;

import java.util.ArrayList;

public class CompareListsMain {
    public static void main(String[] args) {

        CompareLists cp = new CompareLists();
        ArrayList<String> lists = new ArrayList<>();
        lists.add("this");
        lists.add("is");
        lists.add("lots");
        lists.add("of");
        lists.add("for");
        lists.add("every");
        lists.add("Java");
        lists.add("programmer");
        System.out.println(lists);
        ArrayList<String> newLists;
        newLists = cp.markLength4(lists);
        System.out.println(newLists);

    }
}
