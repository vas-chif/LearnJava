package src.encapsulation;

public class InvoiceMain {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("12", "shoes", 3, 12.1);
        System.out.println(invoice.getInvoiceAmount());
    }
}
