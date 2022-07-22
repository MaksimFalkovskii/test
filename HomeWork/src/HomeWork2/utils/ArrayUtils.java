package HomeWork2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {
    public static void main(String[] args) {
    }
    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        System.out.println("введите элементы массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        Random n = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = n.nextInt(maxValueExclusion + 1);
        }
        return array;
    }
}
