package HomeWork2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double value = scanner.nextDouble();
        System.out.println("Введите степень для возведения числа");
        if (scanner.hasNextInt()) {
            int powValue = scanner.nextInt();
            if (powValue > 0) {
                System.out.println(value + " ^ " + powValue + " = " + pow(value, powValue));
            } else {
                System.out.println("Степень - только положительная и целая. Повторите ввод");
            }
        }
    }

    public static double pow(double value, int powValue) {
        int i = 1;
        double result = value;
        while (i < powValue) {
            result = result * value;
            i++;
        }
        return result;
    }
}
