package src.accesmodifiersAndConstructor.constructors;

public class MainStudent {
    public static void main(String[] args) {
        // Creare unui obect prin apelarea  constructorului fara argumente
        Student someStudent = new Student();
        System.out.println(someStudent.getName()); // respectiv pe atribut va fi apelata o valoare predefinita

        //Creare unui obect prin apelarea unui contructor cun argumente
        Student someOtherStudent = new Student("Tom");
        System.out.println(someOtherStudent.getName()); // repectiv pe atribut va fi apelata valoarea declarata "Tom"


    }
}
