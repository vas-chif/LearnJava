package src.encapsulation;

public class Invoice {
    private String partNumber;       // a part number
    private String description;  // a part description
    private int quantity;        // quantity of the items being purchased
    private double price;         // price per item

    public Invoice(String number, String description, int quantity, double price) {
        this.partNumber = number;
        this.description = description;
        // se seteaza imediate atributele in SETER si in constructor se apeleaza seteri
        setQuantity(quantity);
        setPrice(price);
    }

    void setPartNumber(String partNumber) {

        this.partNumber = partNumber;
    }

    public String getPartNumber() {

        return partNumber;
    }

    void setDescription(String description) {

        this.description = description;
    }

    public String getDescription() {

        return description;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }


    public int getQuantity() {
        return quantity;
    }

    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
       /*  p/u a evita de a crea o metode de genul acesta se poate de setta imediate atributele in SETER si in constructor se apeleaza seteri
       if (price < 0){ price = 0; }
        if (quantity < 0) {  quantity = 0; }
       */
        return price * quantity;

    }
}
