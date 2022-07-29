package HomeWork3.calcs.additional;


import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithOperator calculator;
    private long count;

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calc) {
        this.calculator = calc;
    }

    public double addition(double x, double y) {
        incrementCountOperation();
        return calculator.addition(x, y);
    }

    public double subtraction(double x, double y) {
        incrementCountOperation();
        return calculator.subtraction(x, y);
    }

    public double multiplication(double x, double y) {
        incrementCountOperation();
        return calculator.multiplication(x, y);
    }

    public double division(double x, double y) {
        incrementCountOperation();
        return calculator.division(x, y);
    }

    public double exponentiation(double x, int y) {
        incrementCountOperation();
        return calculator.exponentiation(x, y);
    }

    public double numberModulus(double x) {
        incrementCountOperation();
        return calculator.modulusNumber(x);
    }

    public double squareRoot(double x) {
        incrementCountOperation();
        return calculator.squareRoot(x);
    }
}

