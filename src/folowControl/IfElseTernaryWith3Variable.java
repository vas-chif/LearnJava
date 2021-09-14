package src.folowControl;

import java.util.Scanner;

/*Create a program which reads from the keyboard three numbers and prints to the console the smallest one.
 Implement the solution using:
 */
public class IfElseTernaryWith3Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas enter three integers number: ");
        System.out.println("First number: ");
        int a = sc.nextInt();
        System.out.println("Second number: ");
        int b = sc.nextInt();
        System.out.println("Third number: ");
        int c = sc.nextInt();
        //● if-else construct
        if ((a < b) && (a < c)) {
            System.out.println("The number smallest is: " + a + " Verified with if-else construct!");
        } else if ((b < a) && (b < c)) {
            System.out.println("The number smallest is: " + b + " Verified with if-else construct!");
        } else {
            System.out.println("The number smallest is: " + c + " Verified with if-else construct!");
        }
        // ● ternary construct
        //d = c < (a < b ? a : b) ? c:((a < b) ? a:b);
        int smallest = (a < (b < c ? b : c)) ? a : ((b < c) ? b : c);
        System.out.println("The number smallest is : " + smallest + " Verified with ternary construct!");


    }
}
