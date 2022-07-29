package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long count = 0;

    public long getCountOperation() {
        return count;
    }

    @Override
    public double addition(double x, double y) {
        count++;
        return super.addition(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        count++;
        return super.subtraction(x, y);
    }

    @Override
    public double multiplication(double x, double y) {
        count++;
        return super.multiplication(x, y);
    }

    @Override
    public double division(double x, double y) {
        count++;
        return super.division(x, y);
    }

    @Override
    public double exponentiation(double x, int y) {
        count++;
        return super.exponentiation(x, y);
    }

    @Override
    public double modulusNumber(double x) {
        count++;
        return super.modulusNumber(x);
    }

    @Override
    public double squareRoot(double x) {
        count++;
        return super.squareRoot(x);
    }
}
