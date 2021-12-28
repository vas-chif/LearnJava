package src.exceptions;

public class ListIntReaderMain {
    public static void main(String[] args) {

        ListIntReader lr = new ListIntReader();

        int sum = lr.parse("1, 23,v, 8 ,5 , 6, k, d, 9, 8");
        
        System.out.println(sum);

    }
}
