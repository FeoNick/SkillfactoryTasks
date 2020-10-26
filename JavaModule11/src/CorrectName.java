/*
    Задание 11.2.5
    Программа проверяет ввлел ли пользователь полное имя (ФИО)
    если имя не полное то ввод продолжается
    Есть косяк то что программа не обрабатывает знаки пунктуации
 */

import java.util.Scanner;

public class CorrectName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = sc.nextLine(); // Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!!!");
        }
    }

    private static boolean checkName(String str) {
        String[] mas = str.trim().split(" ");
        return mas.length == 3;
    }
}
