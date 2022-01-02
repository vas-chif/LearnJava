package src.interfeaces.shapes;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double n) {
        this(n, n);
    }

    public Point() {
        this(0, 0);
    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return ("< " + getX() + " ; " + getY() + " >");
    }
}
