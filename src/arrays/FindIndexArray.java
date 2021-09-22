package src.arrays;

//5.3.4 Write a Java program to ﬁnd the index of an array element.
public class FindIndexArray {
    public static void main(String[] args) {
        String[] week = {"mon", "tue", "wed", "thu", "fri" , "sat","sun"};
        int count = 0;
        for (String day : week){
            if (day.equals("thu")){
                System.out.println("The week day is Thursday.\n");
                break;
            }
            count++;
        }
        System.out.println("Allocation index in the array is: " + count);
    }
}
