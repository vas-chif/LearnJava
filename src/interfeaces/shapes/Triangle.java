package src.interfeaces.shapes;


public class Triangle extends Polygon {

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
        this.vertices.add(cornerOne);
        this.vertices.add(cornerTwo);
        this.vertices.add(cornerThree);
    }
/*
    @Override
    public void moveUp(int distance) {
        for (Point corner : vertices) {
            corner.setY(corner.getY() + distance);
        }
    }

    @Override
    public void moveDown(int distance) {
        for (Point corner : vertices) {
            corner.setY(corner.getY() - distance);
        }
    }

    @Override
    public void moveLeft(int distance) {
        for (Point corner : vertices) {
            corner.setX(corner.getX() - distance);
        }
    }

    @Override
    public void moveRight(int distance) {
        for (Point corner : vertices) {
            corner.setX(corner.getX() + distance);
        }
    }
 */

    @Override
    public String toString() {
        return String.format("Triangle [%s]", vertices);
    }
}
