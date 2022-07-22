package HomeWork2.loops;

import java.util.Scanner;

public class Task1_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int numb = scanner.nextInt();
        long result = getFactorial(numb);
        if (result > 0) {
            System.out.println(" = " + result);
        }
    }

    public static long getFactorial(int numb) {
        long result = 1;
        System.out.print(1);
        for (int i = 2; i <= numb; i++) {
            result = result * i;
            System.out.print(" * " + i);
            if (result < 0) {
                System.out.println(" - переполнение");
                break;
            }
        }
        return result;
    }
}
