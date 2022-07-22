package HomeWork2.arrays;

import HomeWork2.utils.ArrayUtils;

public class Task2_4 {
    public static void main(String[] args) {
        task2_4_1();
        task2_4_2();
        task2_4_3();

    }

    public static void task2_4_1() {
        System.out.println("Сумма четных положительных элементов массива");
        double result = 0;
        int[] array = ArrayUtils.arrayRandom(50, 100);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                result = result + array[i];
            }
        }
        System.out.println(result);
    }

    public static void task2_4_2() {
        System.out.println("Максимальный из элементов массива с четными индексами");
        double result = 0;
        int[] array = ArrayUtils.arrayRandom(50, 100);
        for (int i : array) {
            if (i % 2 == 0 && i > 0) {
                result += i;
            }
        }
        System.out.println(result);
    }

    public static void task2_4_3() {
        System.out.println("Элементы массива, которые меньше среднего арифметического");
        double result = 0;
        int[] array = ArrayUtils.arrayRandom(50, 100);
        for (int k : array) {
            result += k;
        }
        double v = result / array.length;
        for (int j : array) {
            if (j < v) {
                System.out.print(" " + j);
            }
        }
    }
}
