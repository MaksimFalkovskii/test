package HomeWork1;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 3 числа - ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if ((num1 > num2) && (num1 < num3)) {
            System.out.println("среднее число - " + num1);
        } else if (num2 > num1 && num2 < num3) {
            System.out.println("среднее число - " + num2);
        } else if (num2 > num3 && num2 < num1) {
            System.out.println("среднее число - " + num2);
        } else {
            System.out.println("среднее число - " + num3);
        }
    }
}
