package src.inheritance.shape;

public class Sphere extends ThreeDimensionalShape {

    private int radius;


    public Sphere(int radius) {
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius,2); //A=4πr2
    }

    @Override
    public double calculateVolume() {
        return (4/3d) * Math.PI * Math.pow(radius, 3);//V=4πr3/3
    }
}
