package HomeWork1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сегодня рабочий день?");
        System.out.println("Ввести да или нет");
        String week = scanner.nextLine();
        System.out.println("Сегодня отпуск?");
        System.out.println("Ввести да или нет");

        String voc = scanner.nextLine();

        boolean weekday = week.equals("да");
        boolean vacation = voc.equals("да");

        if (!Sleep(weekday, vacation)) {
            System.out.println("Пора на работу");
        } else {
            System.out.println("Можем спать дальше");
        }
    }

    public static boolean Sleep(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    }
}
