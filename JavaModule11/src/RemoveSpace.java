/*
    Задание 11.2.2
    Программа удаляет пробелы из строки
    способом прохода по массиву
 */
public class RemoveSpace {
    public static void main(String[] args) {
        String str1 = "Remove all white spaces!!!";

        String str2 = removeSpace(str1);
        System.out.println(str2);
    }

    private static String removeSpace(String str1) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                result.append(str1.charAt(i));
            }
        }
        return result.toString();
    }
}
