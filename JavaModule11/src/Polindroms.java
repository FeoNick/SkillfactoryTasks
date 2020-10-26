/*
    Задание 11.2.3
    Программа проверяет является ли строка полиндромом
    и возвращает true или false
 */

public class Polindroms {
    public static void main(String[] args) {
        String polindrom = "Надо меч в кулак, а лук – в чемодан";
        System.out.println(isPolindrom(polindrom));
    }

    private static boolean isPolindrom(String text) {
        String clean = text.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        char[] str = clean.toCharArray();
        boolean poli = true;
        for (int i = 0, j = str.length - 1; i < str.length && j >= 0; i++, j--) {
            if (str[i] != str[j]) {
                poli = false;
                break;
            }
        }
        return poli;
    }
}
