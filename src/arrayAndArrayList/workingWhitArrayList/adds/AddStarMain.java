package src.arrayAndArrayList.workingWhitArrayList.adds;

import java.util.ArrayList;

public class AddStarMain {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("the");
        lists.add("quick");
        lists.add("brown");
        lists.add("fox");
        System.out.println(lists);

        AddStar as = new AddStar();
        System.out.println(as.addStar(lists));

    }
}
