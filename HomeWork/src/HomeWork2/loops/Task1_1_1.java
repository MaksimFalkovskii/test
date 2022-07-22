package HomeWork2.loops;

import java.util.Scanner;

public class Task1_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long result = 1;
        System.out.print(1);
        for (int i = 2; i <= number; i++) {
            result *= i;
            System.out.print(" * " + i);
            if (result < 0) {
                System.out.println(" - Произошло переполнение");
                break;
            }
        }
        if (result > 0) {
            System.out.print(" = " + result);
        }
    }
}
