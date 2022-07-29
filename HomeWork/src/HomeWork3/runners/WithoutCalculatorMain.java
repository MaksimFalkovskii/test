package HomeWork3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double value1  = 28.0 / 5.0; //5.6
        double value2  = Math.pow(value1, 2);// 31.36
        double value3 = 15.0 * 7.0; //105
        double result = 4.1 + value2  + value3; // 4.1 + 31.36 + 105
        System.out.println(result); // 140.46

    }
}
