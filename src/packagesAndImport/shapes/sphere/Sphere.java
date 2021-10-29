package src.packagesAndImport.shapes.sphere;

// volume sphere = ⁴⁄₃ * π * r³,
public class Sphere {

    double sphereVolume(int radius) {
        double volume = (4d / 3) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
