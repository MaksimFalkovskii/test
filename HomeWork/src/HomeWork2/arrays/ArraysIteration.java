package HomeWork2.arrays;

import HomeWork2.utils.ArrayUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        task2_2_1(ArrayUtils.arrayFromConsole());
        task2_2_2(ArrayUtils.arrayFromConsole());
        task2_2_3(ArrayUtils.arrayFromConsole());
    }

    public static void task2_2_1(int[] arrayFromConsole) {
        System.out.println("Выводим все элементы в консоль");
        int num = 0;
        int num2 = 0;
        System.out.println("цикл Do while");
        do {
            System.out.println(arrayFromConsole[num++] + " ");
        } while (num < arrayFromConsole.length);
        System.out.println("цикл While");
        while (num2 < arrayFromConsole.length) {
            System.out.println(arrayFromConsole[num2++] + " ");
        }
        System.out.println("цикл For");
        for (int i = 0; i < arrayFromConsole.length; i++) {
            System.out.println(arrayFromConsole[i]);
        }
        System.out.println("цикл Foreach");
        for (int numbersArrays : arrayFromConsole) {
            System.out.println(numbersArrays);
        }
    }

    public static void task2_2_2(int[] arrayFromConsole) {
        System.out.println("Выводим каждый второй элемент массива в консоль");
        int num = 0;
        int num2 = 0;
        System.out.println("цикл Do while");
        int[] arrayDoWhile = arrayFromConsole;
        do {
            if (num % 2 != 0) {
                System.out.println(arrayDoWhile[num]);
            }
            num++;
        } while (num < arrayFromConsole.length);

        System.out.println("цикл While");
        int[] arrayWhile = arrayFromConsole;
        while (num2 < arrayFromConsole.length) {
            if (num2 % 2 != 0) {
                System.out.println(arrayWhile[num2]);
            }
            num2++;
        }
        System.out.println("цикл For");
        for (int i = 1; i <= arrayFromConsole.length; ) {
            if (i + 1 == arrayFromConsole.length || i + 2 == arrayFromConsole.length) {
                System.out.println(arrayFromConsole[i]);
                break;
            } else {
                System.out.println(arrayFromConsole[i]);
                i = i + 2;
            }
        }
        System.out.println("цикл Foreach");
        int[] arrayForeach = ArrayUtils.arrayFromConsole();
        System.out.println("цикл Foreach");
        int count = 1;
        for (int i : arrayForeach) {
            if (count % 2 != 0) {
                System.out.print(i + " ");
            }
            count++;
        }
    }

    public static void task2_2_3(int[] arrayFromConsole) {
        System.out.println("Выводим все элементы массива в консоль в обратном порядке");
        int num = arrayFromConsole.length - 1;
        int num2 = arrayFromConsole.length - 1;
        System.out.println("цикл Do while");
        do {
            System.out.println(arrayFromConsole[num--] + " ");
        } while (num >= 0);
        System.out.println("цикл While");
        while (num2 >= 0) {
            System.out.println(arrayFromConsole[num2] + " ");
            num2--;
        }
        System.out.println("цикл For");
        for (int i = arrayFromConsole.length - 1; i >= 0; i--) {
            System.out.println(arrayFromConsole[i]);
        }
    }
}
