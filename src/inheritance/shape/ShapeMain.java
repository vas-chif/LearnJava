package src.inheritance.shape;

public class ShapeMain {
    public static void main(String[] args) {
        Circle someCircle = new Circle(5);
        System.out.println("Circle Area is: " + someCircle.calculateArea());

        Square someSquare = new Square(5);
        System.out.println("Square Area is: " + someSquare.calculateArea());

        Sphere someSphere = new Sphere(8);
        System.out.println("Sphere Area is: " +  someSphere.calculateArea());
        System.out.println("Sphere Volume is: " +  someSphere.calculateVolume());

        Cube someCube = new Cube(5);
        System.out.println("Cube Area is: " + someCube.calculateArea());
        System.out.println("Cube Volume is: " + someCube.calculateVolume());
        // POLIMORFIZM - ESTE CAPACITATEA DE ATE ADRESA LA ACELA OBECT PRIN DIFERITE MODELE DE INSTANZIARE
        Shape someCircle1 = new Circle(5);
        TwoDimensionalShape someCircle2 = new Circle(5);
        Circle someCircle3 = new Circle(5);
        System.out.println(someCircle1.calculateArea());
        System.out.println(someCircle2.calculateArea());
        System.out.println(someCircle3.calculateArea());

        Shape someSphere1 = new Sphere(8);
        ThreeDimensionalShape someSphere2 = new Sphere(8);
        Sphere someSphere3 = new Sphere(8);
        // aici putem apela doare calcularea ariei deoare methoda la volum este in class ThreeDimensionalShape
        System.out.println(someSphere1.calculateArea());
        // aici putem apela fie calculateArea si calculateVolume, deoarece priam este mostenita di Shape a doua este din ThreeDimensionalShape
        System.out.println(someSphere2.calculateArea());
        System.out.println(someSphere2.calculateVolume());
        // aici putem apela fie calculateArea si calculateVolume, deoarece prima este mostenita di Shape a doua este din ThreeDimensionalShape
        System.out.println(someSphere3.calculateArea());
        System.out.println(someSphere3.calculateVolume());
        
    }
}
