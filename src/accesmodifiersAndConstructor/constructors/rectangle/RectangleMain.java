package src.accesmodifiersAndConstructor.constructors.rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();
        System.out.println(rectangleOne.getArea());

        Rectangle rectangleTwo = new Rectangle(6, 8);
        System.out.println(rectangleTwo.getArea());

        Rectangle rectangleThree = new Rectangle(8);
        System.out.println(rectangleThree.getArea());
    }
}
