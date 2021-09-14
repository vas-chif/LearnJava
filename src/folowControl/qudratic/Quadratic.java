package src.folowControl.qudratic;

public class Quadratic {
    public static void main(String[] args) {
        int a = 1, b = 5, c = 1;
        // ax2 + bx + c = 0

        int delta = b * b - 4 * a * c;
        double x1 = 0;
        double x2 = 0;

        if (delta > 0) {
            //x = −b ± √(b*b − 4*a*c)/2a
            //           delta
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("X1 = X2 = " + x2);
        } else {                                     // else if (delta <0){}
            System.out.println("There are not roots fot this equation.");
        }
    }
}
