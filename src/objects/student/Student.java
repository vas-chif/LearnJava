package src.objects.student;

/*6.1 The Student Class
1. Create a class named Student with a String variable name and a variable roll_no of type int.
2. Create an instance of this class.
3. Assign the value of roll_no as 2 and that of name as "John".
4. Print the state of the object (its attributes) to the console.
5. Create a method to print the state of the object to the console.
 */
public class Student {
    String name;
    int roll_no;

    // creare unei metode di print
    void printState(){ //aici este o metoda goale --- void
        System.out.print("Student[ name: "+ name + ", roll_no: " + roll_no + " ]");

    }
    String printStringState (){ // aici metoda este de tip "String" = resulta ca si tipul de date "ruturn" trebue sa fie de tip "String"
        return "Student[ name: "+ name + ", roll_no: " + roll_no + " ]";
    }
}
