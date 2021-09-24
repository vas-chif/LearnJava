package src.objects.references;

/*2.
Create another class, with a main method inside (the steps below must be done inside the main
method).
3. Declare a reference dog1 of type Dog and assign to it an instance of a Dog class.
4. Declare another reference dog2 of type Dog, and assign to it another instance of a Dog class.
5. Set the age on dog1 instance to 1 and dog2 to 2 (dog1.age = 1;).
6. Declare two variables of type int (var1 and var2) and initialize them with value 10 and 11.
7. Print all variables to the console.
8. Assign var2 variable to var1.
9. Assign dog2 reference to dog1.
10. Print all variables to the console.
11. Change the value of variable var2 to 12.
12. Change the age of dog1 instance to 3.
13. Print all variables to the console.
Notice the change. What happened?
 */
public class DogMain {
    public static void main(String[] args) { //2.
        Dog dog1 = new Dog(); //3.
        Dog dog2 = new Dog(); //4.
        dog1.age = 1; //5.
        dog2.age = 2; //5.
        int var1 = 10; //6.
        int var2 = 11; //6.
        System.out.println("Age dog1 = " + dog1.age + ";\nAge doe2 = " + dog2.age + ";\nvar1 = " +
                var1 + ";\nvar2 = " + var2 + "."); //7
        System.out.println("------------------------------");
        var2 = var1; //8
        dog2 = dog1; //9
        System.out.println("Age dog1 = " + dog1.age + ";\nAge doe2 = " + dog2.age + ";\nvar1 = " +
                var1 + ";\nvar2 = " + var2 + ".");  //10.

        System.out.println("------------------------------");
        var2 = 12; //11.
        dog1.age = 3; //12.
        System.out.println("Age dog1 = " + dog1.age + ";\nAge doe2 = " + dog2.age + ";\nvar1 = " +
                var1 + ";\nvar2 = " + var2 + ".");  //13.
    }
}
