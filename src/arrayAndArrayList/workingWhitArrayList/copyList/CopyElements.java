package src.arrayAndArrayList.workingWhitArrayList.copyList;

import java.util.ArrayList;

/*Exercise #12.2
12.2.1Write a Java program to join two ArrayLists (copy the elements from one list to another). */
public class CopyElements {
    // 12.2.1
    ArrayList<String> copiedElements(ArrayList<String> uneditedList, ArrayList<String> editedList) {
        uneditedList.addAll(editedList);
        return uneditedList;
    }

    // 12.2.1
    ArrayList<String> copiedElementsUsingLoop(ArrayList<String> uneditedList, ArrayList<String> listToEdit) {
        for (String elements : listToEdit) {
            //System.out.println(elements);
        }
        return uneditedList;
    }

}
