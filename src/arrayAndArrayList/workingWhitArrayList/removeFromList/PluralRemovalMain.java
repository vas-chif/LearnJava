package src.arrayAndArrayList.workingWhitArrayList.removeFromList;

import java.util.ArrayList;

public class PluralRemovalMain {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("apples");
        list.add("car");
        list.add("people");
        System.out.println(list);

        PluralRemoval pr = new PluralRemoval();
        ArrayList<String> listWhitOutPlurals = pr.removalPlural(list);
        System.out.println(listWhitOutPlurals);
    }
}
