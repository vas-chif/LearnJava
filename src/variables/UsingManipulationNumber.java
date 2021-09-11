package src.variables;

public class UsingManipulationNumber {
    public static void main(String[] args) {

        /*Declare and initialize numeric ﬁelds: price (double), tax(double) and quantity(int). Also declare
        total, but do not initialize it.
        */

        //4. Print a message showing the total cost, e.g.: “Total cost with tax is: 29.6 ”.
        double price = 12.1;
        double tax = 0.22;
        double rate = (price * (tax * 100)) / 100;
        int quantity = 2;
        String product = "Shirt";
        //2. Create a String message to include quantity, e.g.: “I want to buy 1 shirt!” and print it.
        System.out.println("I want to buy" + " " + quantity + " " + product);
        //3. Calculate total by multiplying price * quantity * tax .
        double total = (price * quantity) + (rate + quantity);
        System.out.println("“Total cost with tax is: " + total);
       // System.out.println(rate);

    }
}
