package HomeWork1;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int numbOne = scanner.nextInt();
        int numbTwo = scanner.nextInt();
        if (numbOne % numbTwo == 0) {
            System.out.println("числа деляться без остатка, получилось - " + (numbOne / numbTwo));
        } else {
            System.out.println("числа деляться с остатком, остаток - " + numbOne % numbTwo);
        }
    }
}
