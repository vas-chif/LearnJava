package src.interfeaces.shapes;

import src.packagesAndImport.points.Point;

public class Triangle extends Polygon{
    Point cornerOne;
    Point cornerTwo;
    Point CornerThree;

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
        this.cornerOne = cornerOne;
        this.cornerTwo = cornerTwo;
        CornerThree = cornerThree;
    }

    @Override
    public String toString(){
        return String.format("");
    }

    @Override
    public void moveUp(int distance) {

    }

    @Override
    public void moveDown(int distance) {

    }

    @Override
    public void moveLeft(int distance) {

    }

    @Override
    public void moveRight(int distance) {

    }
}
