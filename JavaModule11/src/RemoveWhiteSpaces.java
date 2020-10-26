/*
   Задание 11.2.4
   Программа удаляет все пробелы из строки методом класса String
 */

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String s) {
        return s.replaceAll(" ", "");
    }
}
