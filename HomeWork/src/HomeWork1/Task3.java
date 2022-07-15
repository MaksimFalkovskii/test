package HomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("возвращает абсолютное значение - " + Math.abs(a));
        System.out.println(" возвращает квадратный корень числа - " + Math.sqrt(a));
        System.out.println("возвращает кубический корень числа - " + Math.cbrt(a));
        System.out.println("округление до ближайшего целого числа - " + Math.round(a));
        System.out.println("возвращает случайное число от 0.0 до 1.0 - " + Math.random());
        System.out.println("возвращает максимальное число из a и b - " + Math.max(a, b));
        System.out.println("возвращает минимальное число из a и b - " + Math.min(a, b));
        System.out.println("возвращает число a, возведенное в степень b - " + Math.pow(a, b));
        System.out.print("Введите радиус круга: ");
        int radius = scanner.nextInt();
        long area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.printf("Площадь круга с радиусом %d равна %d \n", radius, area);
        System.out.println("возвращает синус угла - " + Math.sin(a));
        System.out.println("возвращает косинус угла - " + Math.cos(a));
    }
}
