package src.exceptions.division;

import java.util.Scanner;

public class TestNumberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Numbers nr = new Numbers(5);

        System.out.println("Enter number by divide: ");
        try {
            double result = nr.divideBy(sc.nextInt());
            System.out.println(result);
        } catch (IllegalArgumentException il) {
            System.out.println(il.getMessage());
        }
    }
}
