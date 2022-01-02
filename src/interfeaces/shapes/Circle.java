package src.interfeaces.shapes;

public class Circle implements IMovable {
    private Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp(int distance) {
        center.setY(center.getY() + distance);
    }

    @Override
    public void moveDown(int distance) {
        center.setY(center.getY() - distance);
    }

    @Override
    public void moveLeft(int distance) {
        center.setX(center.getX() - distance);
    }

    @Override
    public void moveRight(int distance) {
        center.setX(center.getX() + distance);
    }

    @Override
    public String toString() {
        return String.format("Circle[ %s, radius = %s", center.toString(), radius);
    }
}
