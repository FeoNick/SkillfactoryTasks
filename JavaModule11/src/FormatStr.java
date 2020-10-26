/*
    Задание 11.2.8
    Программа демонстрирует форматированный вывод строк
 */

public class FormatStr {
    public static void main(String[] args) {
        String str1 = "Сегодня что-то очень холодно!";
        String str2 = "Надеюсь завтра будет теплее";
        int num = 23;
        formStr(str1,str2,num);
    }

    private static void formStr(String s1, String s2, int numb) {
        String cool =
                String.format("Было получено 2 строки: str1 = %s и str2 = %s, а также одно число num = %d",
                        s1,s2,numb);
        System.out.println(cool);
    }
}
