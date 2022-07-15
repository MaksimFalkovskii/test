package HomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 любых числа: ");
        int numberOne = scanner.nextInt(); //например число 43 в двоичной системе исчисления 0010_1011
        int numberTwo = scanner.nextInt(); //например число 51 в двоичной системе исчисления 0011_0011

        System.out.println(numberOne & numberTwo); //число 35 в двоичной системе  0010_0011
        System.out.println(numberOne | numberTwo); //число 59 в двоичной системе  0011_1011

        /* 1.4
        double numberOne | 42.5;
         в Java побитовые операции выполняются только с целыми числами
        */
    }
}
