/*
    Задание 11.2.7
    Программа преобразует номер телеофона в приемлимый формат
 */

import java.util.Scanner;

public class CorrectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCorrect = false;

        while (!isCorrect) {
            System.out.print("Введите номер телефона: ");
            String number = sc.nextLine().trim();
            isCorrect = isCorrectNumber(number);
            if (isCorrect) {
                System.out.println(formatPhone(number));
            } else System.out.println("Введите корректный номер телефона!");
        }
    }

    private static boolean isCorrectNumber(String num) {
        String clean = num.replaceAll("[^0-9]", "");
        return clean.length() == 11;
    }

    private static String formatPhone(String num) {
        String clean = num.replaceAll("[^0-9]", "");
        return "+7" + " " + clean.substring(1, 4) + " " +
                clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);

    }


}
