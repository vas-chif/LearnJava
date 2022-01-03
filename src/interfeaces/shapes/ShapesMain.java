package src.interfeaces.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesMain {
    public static void main(String[] args) {
        // modalitatea de a misca fiecare obect separat
        Circle someCircle = new Circle(new Point(5, 5), 3);
       /* System.out.println(someCircle);

        someCircle.moveUp(2);
        someCircle.moveLeft(3);
        System.out.println(someCircle);

        someCircle.moveDown(8);
        someCircle.moveRight(6);
        System.out.println(someCircle);
        System.out.println();
        
        */

        Rectangle someRectangle = new Rectangle(new Point(3, 3), 5, 2);
      /*  System.out.println(someRectangle);

        someRectangle.moveUp(4);
        someRectangle.moveLeft(8);
        System.out.println(someRectangle);

        someRectangle.moveDown(8);
        someRectangle.moveRight(4);
        System.out.println(someRectangle);
        System.out.println();

       */

        Triangle someTriangle = new Triangle(new Point(8, 8), new Point(4, 6), new Point(4, 4));
      /*
              System.out.println(someTriangle);

        someTriangle.moveUp(4);
        someTriangle.moveLeft(8);
        System.out.println(someTriangle);

        someTriangle.moveDown(8);
        someTriangle.moveRight(4);
        System.out.println(someTriangle);

       */

        // modalitatea de a misca tote obiectele împreuna
        //punem tote obectele intro lista de a putea fi miscate, si miscam orce obect ce implimenteaza Interfaza Imovable
        List<IMovable> shapes = new ArrayList<>();
        shapes.add(someCircle);
        shapes.add(someRectangle);
        shapes.add(someTriangle);
        System.out.println(shapes);
        for (IMovable shape : shapes){
            shape.moveRight(5);
        }
        System.out.println(shapes);
        // prin o singura actiune am mutat toate obectele pe acest plan 2 d
    }
}
