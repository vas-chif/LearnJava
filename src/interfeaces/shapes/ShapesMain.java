package src.interfeaces.shapes;

public class ShapesMain {
    public static void main(String[] args) {
        Circle someCircle = new Circle(new Point(5,5), 3);
        System.out.println(someCircle);

        someCircle.moveUp(2);
        someCircle.moveLeft(3);
        System.out.println(someCircle);

        someCircle.moveDown(8);
        someCircle.moveRight(6);
        System.out.println(someCircle);
    }
}
