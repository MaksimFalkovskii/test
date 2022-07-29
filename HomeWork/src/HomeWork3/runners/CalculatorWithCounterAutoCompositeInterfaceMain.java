package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(calc);
        double result = calculator.addition(4.1, calculator.addition(calculator.multiplication(15, 7), calculator.exponentiation(calculator.division(28, 5), 2)));
        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}
