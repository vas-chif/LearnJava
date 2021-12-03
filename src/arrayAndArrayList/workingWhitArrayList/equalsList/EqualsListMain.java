package src.arrayAndArrayList.workingWhitArrayList.equalsList;

import java.util.ArrayList;

public class EqualsListMain {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Car");
        list1.add("Rac");
        list1.add("Bac");
        list1.add("Cab");

        ArrayList<String>list2 = new ArrayList<>();
        list2.add("Car");
        list2.add("Rac");
        list2.add("Bac");
        list2.add("Cab");

        EqualsLists el = new EqualsLists();

        System.out.print("The List is equals? \n"+ el.listToCompare(list1, list2));
    }
}
