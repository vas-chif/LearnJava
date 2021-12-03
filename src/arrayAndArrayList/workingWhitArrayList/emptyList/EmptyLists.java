package src.arrayAndArrayList.workingWhitArrayList.emptyList;
// 12.2.2Write a Java program to empty an ArrayList.
import java.util.ArrayList;

public class EmptyLists {

    ArrayList<String> listToClear(ArrayList<String> lists){
        lists.clear();
        return lists;
    }

    ArrayList<String> listToClearUsingLoop(ArrayList<String> lists){
        for (String elements : lists){
            lists.remove(elements);
        }
        return lists;
    }
}
