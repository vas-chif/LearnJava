package src.accesmodifiersAndConstructor.constructors;

public class Student {
    /*  //este o optiune
    private String name = "Unknown";
     */

    private String name;

    Student() {

        name = "Unknown";
    }

    Student(String name) {
        this.name = name; // daca variabilele conincid prin apelara key "this." si invoca varibila din externul constructorului
    }

    public String getName() {

        return name;
    }
}
