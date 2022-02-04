package src.interfaces.aShapes;


public class Rectangle extends Polygon {


    public Rectangle(Point topRightCorner, int width, int height) {
        Point topLeftCorner = new Point(topRightCorner.getX() - width, topRightCorner.getY());
        Point bottomLeftCorner = new Point(topRightCorner.getX() - width, topLeftCorner.getY() - height);
        Point bottomRightCorner = new Point(topRightCorner.getX(), topRightCorner.getY() - height);

        this.vertices.add(topRightCorner);
        this.vertices.add(topLeftCorner);
        this.vertices.add(bottomRightCorner);
        this.vertices.add(bottomLeftCorner);
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
        for (Point corner: vertices){
            corner.setX(corner.getX() - distance);
        }
    }

    @Override
    public void moveRight(int distance) {
        for (Point corner : vertices){
            corner.setX(corner.getX() + distance);
        }
    }
 */

    @Override
    public String toString() {
        return String.format("Rectangle [%s]", vertices );
    }
}
