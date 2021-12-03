package src.arrayAndArrayList.workingWhitArrayList.replace;

import java.util.ArrayList;
import java.util.Scanner;

// 12.2.3Write a Java program to replace the second element of an ArrayList with some other element.
public class ReplaceElements {

    ArrayList<String> listToReplace(ArrayList<String> listToWork){

        listToWork.set(1, elementToReplace());

        return listToWork;
    }

    String elementToReplace(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the elemento for replace!");
        String element = sc.next();
        return element;
    }

}
