package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double exponentiation(double x, int y) {
        return Math.pow(x, y);
    }

    @Override
    public double modulusNumber(double x) {
        return Math.abs(x);
    }

    @Override
    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

}
