package HomeWork1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите год:");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный - " + year);
        } else {
            System.out.println("Год не високосный - " + year);
        }
    }
}
