package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double exponentiation(double a, int b) {
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public double modulusNumber(double a) {
        double result = 0;
        if (a == 0 || a > 0) {
            result = a;
        } else if (a < 0) {
            result = -1 * a;
        }
        return result;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}