package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
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
        return Math.pow(a, b);
    }

    public double modulusNumber(double a) {
        return Math.abs(a);
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}
