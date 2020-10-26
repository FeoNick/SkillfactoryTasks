/*
   Задание 11.2.1
   Программа производит конкатенацию строк,
 * и возвращает результат в виде массива символов
 */

public class ConcatStr {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "NickFeo";

        char[] arr = concat(str1, str2);
        for (char i : arr) {
            System.out.print(i + " ");
        }
    }

    private static char[] concat(String strs1, String strs2) {
        String str = strs1 + strs2;
        return str.toCharArray();
    }
}
