package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calc1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calc3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        CalculatorWithCounterAutoChoiceAgregation calc2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());

        double result1 = calc1.addition(4.1, calc1.addition(calc1.multiplication(15, 7), calc1.exponentiation(calc1.division(28, 5), 2)));
        System.out.println(result1);
        System.out.println(calc1.getCountOperation());

        double result2 = calc2.addition(4.1, calc2.addition(calc2.multiplication(15, 7), calc2.exponentiation(calc2.division(28, 5), 2)));
        System.out.println(result2);
        System.out.println(calc2.getCountOperation());

        double result3 = calc3.addition(4.1, calc3.addition(calc3.multiplication(15, 7), calc3.exponentiation(calc3.division(28, 5), 2)));
        System.out.println(result3);
        System.out.println(calc3.getCountOperation());
    }
}
