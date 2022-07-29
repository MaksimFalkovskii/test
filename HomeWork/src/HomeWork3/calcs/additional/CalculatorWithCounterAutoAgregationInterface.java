package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    private long count = 0;

    public long getCountOperation() {
        return count;
    }

    public double addition(double a, double b) {
        count++;
        return calculator.addition(a, b);
    }

    public double subtraction(double a, double b) {
        count++;
        return calculator.subtraction(a, b);
    }

    public double multiplication(double a, double b) {
        count++;
        return calculator.multiplication(a, b);
    }

    public double division(double a, double b) {
        count++;
        return calculator.division(a, b);
    }

    public double exponentiation(double a, int b) {
        count++;
        return calculator.exponentiation(a, b);
    }

    public double modulusNumber(double a) {
        count++;
        return calculator.modulusNumber(a);
    }

    public double squareRoot(double a) {
        count++;
        return calculator.squareRoot(a);
    }
}
