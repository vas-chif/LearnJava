package src.arrays;

/*
Write an expression that refers to the string Brighton within the array.
What is the value of the expression skiResorts.length?
What is the index of the last item in the array?
What is the value of the expression skiResorts[4]?
 */
public class StringArray {
    public static void main(String[] args) {
        String[] skiResorts = {"Whistler Blackcombo", "Squaw Valley", "Brighton", "Snowmass", "Sun Valley", "Taos"};
        //Write an expression that refers to the string Brighton within the array.
        for (String name : skiResorts) {
            if (name.equals("Brighton"))
                System.out.println("Printed using loop." + name);
        }
        System.out.println(skiResorts[2] + "\n");
        //What is the value of the expression skiResorts.length?
        System.out.println("Length skiResorts is: " + skiResorts.length);
        //What is the index of the last item in the array?
        int count = 0;
        for (int i = 0; i < skiResorts.length - 1; i++) {
            count++;
        }
        System.out.println("Laste index is: " + count + " = " + skiResorts[count]);
        //What is the value of the expression skiResorts[4]?
        System.out.println("The value of the expression skiResorts[4] is: " + skiResorts[4]);
    }
}
