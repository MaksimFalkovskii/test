package HomeWork3.calcs.additional;

public class CalculatorWithCounterAutoComposite {

    CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

    public long getCountOperation() {
        return calc.count;
    }

    public double addition(double x, double y) {
        return calc.addition(x, y);
    }

    public double subtraction(double x, double y) {
        return calc.subtraction(x, y);
    }

    public double multiplication(double x, double y) {
        return calc.multiplication(x, y);
    }

    public double division(double x, double y) {
        return calc.division(x, y);
    }

    public double exponentiation(double x, int y) {
        return calc.exponentiation(x, y);
    }

    public double numberModulus(double x) {
        return calc.modulusNumber(x);
    }

    public double squareRoot(double x) {
        return calc.squareRoot(x);
    }
}
