package src.arrayAndArrayList.workingWhitArrayList.replace;

import java.util.ArrayList;

public class ReplaceElementsMain {
    public static void main(String[] args) {

        ArrayList<String> anyList = new ArrayList<>();
        anyList.add("!!!");
        anyList.add("???");
        anyList.add("World");
        anyList.add("!!!");

        System.out.println(anyList);

        ReplaceElements rp = new ReplaceElements();
        System.out.println(rp.listToReplace(anyList));
    }
}
