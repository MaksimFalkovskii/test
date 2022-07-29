package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    CalculatorWithOperator calculator1;
    CalculatorWithMathCopy calculator2;
    CalculatorWithMathExtends calculator3;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calculator1 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calculator3 = calculator;
    }

    private long count;
    public void incrementCountOperation(){
        count++;
    }
    public long getCountOperation(){
        return count;
    }

    public double addition(double a, double b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.addition(a, b);
        } else if (calculator2 != null) {
            return calculator2.addition(a, b);
        } else {
            return calculator3.addition(a, b);
        }
    }

    public double subtraction(double a, double b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.subtraction(a, b);
        } else if (calculator2 != null) {
            return calculator2.subtraction(a, b);
        } else {
            return calculator3.subtraction(a, b);
        }
    }

    public double multiplication(double a, double b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.multiplication(a, b);
        } else if (calculator2 != null) {
            return calculator2.multiplication(a, b);
        } else {
            return calculator3.multiplication(a, b);
        }
    }

    public double division(double a, double b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.division(a, b);
        } else if (calculator2 != null) {
            return calculator2.division(a, b);
        } else {
            ;
            return calculator3.division(a, b);
        }
    }

    public double exponentiation(double a, int b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.exponentiation(a, b);
        } else if (calculator2 != null) {
            return calculator2.exponentiation(a, b);
        } else {
            return calculator3.exponentiation(a, b);
        }
    }

    public double modulusNumber(double a) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.modulusNumber(a);
        } else if (calculator2 != null) {
            return calculator2.modulusNumber(a);
        } else {
            return calculator3.modulusNumber(a);
        }
    }

    public double squareRoot(double a) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.squareRoot(a);
        } else if (calculator2 != null) {
            return calculator2.squareRoot(a);
        } else {
            return calculator3.squareRoot(a);
        }
    }
}
