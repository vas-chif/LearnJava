package src.arrayAndArrayList.workingWhitArrayList.compares;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
Write a method markLength4 that takes an ArrayList of Strings as a parameter and places a String of
four asterisks "****" in front of every string of length 4.
For example, suppose that a variable called list contains the following values:
{"this", "is", "lots", "of", "for", "every", "Java", "programmer"}
and you make the following call: markLength4(list);
then list should store the following values after the call:
{"****this", "is", "****lots", "of", "for", "every", "****Java", "programmer"}
 */
public class CompareLists {

    ArrayList<String> markLength4(ArrayList<String> workList) {

        ArrayList<String> modifiedWorkList = new ArrayList<>();

        ListIterator<String> it = workList.listIterator();

        while (it.hasNext()) {
            String element = it.next();
            if (element.length() == 4) {
                element = "****" + element;
            }
            modifiedWorkList.add(element);
        }

        return modifiedWorkList;
    }

}
