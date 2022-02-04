package src.interfaces.aShapes;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon implements IMovable{

    protected List<Point> vertices;

    protected Polygon() {
        this.vertices = new ArrayList<>();
    }
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
}
