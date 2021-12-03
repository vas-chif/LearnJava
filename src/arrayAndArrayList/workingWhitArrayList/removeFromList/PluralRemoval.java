package src.arrayAndArrayList.workingWhitArrayList.removeFromList;

//12.2.4Write a method removePlurals that accepts an ArrayList of Strings and removes every
//element from the list ending with an "s", case-insensitively.

import java.util.ArrayList;
import java.util.ListIterator;

public class PluralRemoval {
    ArrayList<String> removalPlural(ArrayList<String> listToProcess) {

        /*  // -- din causa ca nu pote sa fac doua lucruri odata trebue de folosit iteratorul
        for (String elementFromList : listToProcess) {
            if (elementFromList.endsWith("s") || elementFromList.endsWith("S")) {
                listToProcess.remove(elementFromList);
            }
         }   // -- cu exemplul acetsat imi da exceptia ConcurrentModificationException
         */
        ListIterator<String> it = listToProcess.listIterator();
        while (it.hasNext()){
            String elementFromList = it.next();
            if (elementFromList.endsWith("s") || elementFromList.endsWith("S")){
                it.remove();
            }

        }

        return listToProcess;
    }

}
