/*
    Задание 11.2.6
    Программа выполняет проверку имени на корректность ФИО
    выполняет сортировку слов в ФИО по кол-ву символов в слове
    если элемент ФИО начиналься с маленькой буквы, то исправляет на большую
 */

import java.util.Scanner;

public class FormatName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = sc.nextLine();
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
            else System.out.println(formatName(name));
        }

    }

    // метод преобразования имени - все слова с большой буквы + сортировка
    private static String formatName(String str) {
        String[] s = str.trim().split(" ");
        String s1 = "";
        sortByLength(s);
        for (String i : s)
            s1 += (i.replaceFirst(String.valueOf(i.charAt(0)), String.valueOf(i.charAt(0)).toUpperCase()) + " ");
        return s1.trim();
    }

    // Метод сортировки слов в строке по кол-ву символов в слове
    private static void sortByLength(String[] str) {
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].length() > str[j].length()) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                    break;
                }
            }
        }
    }

    // Проверка на правильность ФИО (не хватает проверки на знаки пунктуаци)
    private static boolean checkName(String str) {
        String[] s = str.trim().split(" ");
        return s.length == 3;
    }
}