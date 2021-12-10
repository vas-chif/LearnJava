package src.arrayAndArrayList.workingWhitArrayList.adds;
/*
Write a method addStars that accepts an ArrayList of Strings as a parameter and places an * (asterisk)
after each element in the list.
For example, if an ArrayList named list initially stores:
[the, quick, brown, fox]
then the call of addStars(list);makes it store:
[the, *, quick, *, brown, *, fox, *]
 */

import java.util.ArrayList;

public class AddStar {
    ArrayList<String> addStar(ArrayList<String> workList) {
        ArrayList<String> modifiedWorkList = new ArrayList<>();

        for (String element : workList){
            modifiedWorkList.add(element);
            modifiedWorkList.add("*");
        }

        return modifiedWorkList;
    }
}
