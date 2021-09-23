package src.objects.student;

public class StudentMain {
    public static void main(String[] args) {
        Student someStudent = new Student();
        someStudent.name = "Tom";
        someStudent.roll_no = 1;
        System.out.println(someStudent.name);
        System.out.println(someStudent.roll_no);
        System.out.println();
        // acelasci cod  de mai sus
        String name = someStudent.name;
        int no_students = someStudent.roll_no;
        System.out.println(name);
        System.out.println(no_students);
        System.out.println();
        // o alta mod de scosa la ecran
        System.out.println("Student[ name: "+ someStudent.name + ", roll_no: " + someStudent.roll_no + " ]");
        System.out.println();
        // printarea la ecran prin metoda de tip "void"
        someStudent.printState();
        System.out.println(" Out with the void method");
        // printarea la ecran prin metoda de tip "String
        String objectState = someStudent.printStringState();
        System.out.println(objectState + " Out with the String method");
    }
}
