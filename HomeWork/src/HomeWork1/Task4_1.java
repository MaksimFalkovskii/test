package HomeWork1;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число - ");

        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("число четное - " + number);
        } else {
            System.out.println("число не четное - " + number);
        }
    }
}
