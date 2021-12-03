package src.arrayAndArrayList.workingWhitArrayList.equalsList;
// 12.2.6Write a Java program which compares two ArrayLists of String objects.

import java.util.ArrayList;

public class EqualsLists {
    boolean listToCompare(ArrayList<String> workingList, ArrayList listToCompare) {

        for (int i = 0, j = 0; i < workingList.size(); i++, j++){
            if (workingList.equals(listToCompare)){
                return true;
            }
        }
        return false;
    }
}
