package src.exponentiation;

public class Exponentiation {

    double integerPower(int base, int exponent) {

        double power = 1;
        for (int i = 0; i < exponent; i++){
            power *= base;
        }
        return power;
    }
}
