package src.packagesAndImport.shirt;

public class Shirt {
    public String description;
    public  char colorCode;
    public char size;
    public double price;

    public void setFile(String desc, char color, char size, double price){
        this.description = desc;
        this.colorCode = color;
        this.size = size;
        this.price = price;
    }
}
