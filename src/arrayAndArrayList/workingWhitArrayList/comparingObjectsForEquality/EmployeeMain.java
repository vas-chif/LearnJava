package src.arrayAndArrayList.workingWhitArrayList.comparingObjectsForEquality;

import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String[] args) {

        ArrayList<Employee> employeeListOne = new ArrayList<>();
        ArrayList<Employee> employeeListTwo = new ArrayList<>();

        // Can be replaced with a parameterized constructor.
        Employee emp1 = new Employee();
        emp1.setId("1");
        emp1.setName("Tom");
        emp1.setSalary(2323426);

        Employee emp2 = new Employee();
        emp2.setId("2");
        emp2.setName("Julia");
        emp2.setSalary(3456756);

        Employee emp3 = new Employee();
        emp3.setId("3");
        emp3.setName("Mike");
        emp3.setSalary(5343632);

        employeeListOne.add(emp1);
        employeeListOne.add(emp2);
        employeeListOne.add(emp3);

        Employee emp4 = new Employee("1", "Tom", 2323426);
        Employee emp5 = new Employee("2", "Julia", 3456756);
        Employee emp6 = new Employee("3", "Mike", 5343632);

        employeeListTwo.add(emp4);
        employeeListTwo.add(emp5);
        employeeListTwo.add(emp6);

        System.out.println(employeeListOne.equals(employeeListTwo));

        for (Employee emp : employeeListOne){
            if (emp.getId() == "2"){
                System.out.println(emp.toString());
                break;
            }
        }

    }
}
