package HomeWork1;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число - ");
        long numb = scanner.nextLong();
        System.out.print("введите b или kb");
        String byteOrKilobyte = scanner.next();
        if (byteOrKilobyte.equals("b")) {
            System.out.println("получаем килобайт - " + numb / 1024);
        } else {
            if (byteOrKilobyte.equals("kb")) {
                System.out.println("получаем байт - " + numb * 1024);
            } else {
                System.out.println("не верный ввод");
            }
        }
    }
}
