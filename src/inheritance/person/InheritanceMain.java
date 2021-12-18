package src.inheritance.person;

public class InheritanceMain {
    public static void main(String[] args) {
        Students someStudent = new Students("Tom", "Chisinau", "IT", 12, 50.0);
        System.out.println(someStudent);

        Staff someStaff = new Staff("Tom", "Chisinau", "Nr.1", 128.7);
        System.out.println(someStaff);
    }
}
