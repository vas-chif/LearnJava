package src.arrayAndArrayList.workingWhitArrayList.comparingObjectsForEquality;
/*
1.Declare an Employee class with three attributes: id, name and salary.
2.Create an ArrayList with some Employee objects.
3.Write a Java method to search in a list of Employees an Employee that matches a given ID and returns
the found object. Display all data about the found Employee at the console.
4.
Write a Java program which compares two ArrayLists of Employee. Two objects of Employee
class are equal if their name and salary match.
 */

import java.util.ArrayList;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // se poate de folosit constructor pentru a nu apela de fiecare data in "main" "get" si "set"


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Object objectToCompare) {
        //System.out.println("Comparing two Employee Object " + objectToCompare.toString());
        if (objectToCompare instanceof Employee) {
            // (ca sa conversezi desigur )ca conversia va merge daca aceste doua tipuri de conversie sint compatibile
            // in cazul dat classa employe mosteneste automat della classa "Object" chiar daca nu este declarata in codrul sursa "public class Employee extends Object"
            Employee emp = (Employee) objectToCompare; // se conversiaza "objectToCompare" in date "Employee", cum se face cu alte date de exemplu
            // int nr = (double) 242; este acelasi metod de convertire a datelor
            return id.equals(emp.id) && name.equals(emp.name) && salary == salary;
        }
        return false;
    }

    public String toString() {
        //return "Employee [Id: " + getId() + ", Name: " + getName() + ", Salary: " + getSalary() + "]";
        // este mod egad de a fomata un string
        return String.format("Employee [id = %s, name = %s, Salary = %s]",id, name, salary);
    }

    public boolean comparingId(ArrayList<Employee> workList){
        for (Employee id : workList){
            if (id.equals(getId())){
                System.out.println("List: " + workList.toString());
                break;
            }
        }
        return false;
    }
}
