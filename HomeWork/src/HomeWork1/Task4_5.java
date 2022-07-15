package HomeWork1;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите букву или символ ");
        String string = scanner.next();
        char unit = string.charAt(0);
        if (unit >= 65 && unit <= 90 || unit >= 97 && unit <= 122) {
            System.out.println("буква");
        } else {
            System.out.println("символ");
        }
    }
}
