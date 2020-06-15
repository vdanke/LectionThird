package org.step.fourth.strings;

import java.util.Date;
import java.util.Random;

public class StringExample {

    /*
    %a Шестнадцатеричное значение с плавающей точкой
    %b Логическое (булево) значение аргумента
    %c Символьное представление аргумента
    %d Десятичное целое значение аргумента
    %h Хэш-код аргумента
    %e Экспоненциальное представление аргумента
    %f Десятичное значение с плавающей точкой
    %g Выбирает более короткое представление из двух: %e или %f
    %o Восьмеричное целое значение аргумента
    %n Вставка символа новой строки
    %s Строковое представление аргумента
    %t Время и дата
    %x Шестнадцатеричное целое значение аргумента

    Special for time
    %tH Час (00 - 23)
    %tI Час (1 - 12)
    %tM Минуты как десятичное целое (00 - 59)
    %tS Секунды как десятичное целое (00 - 59)
    %tL Миллисекунды (000 - 999)
    %tY Год в четырехзначное формате
    %ty Год в двузначное формате (00 - 99)
    %tB Полное название месяца (“Январь”)
    %tb или %th Краткое название месяца (“янв”)
    %tm Месяц в двузначном формате (1 - 12)
    %tA Полное название дня недели (“Пятница”)
    %ta Краткое название дня недели (“Пт”)
    %td День в двузначном формате (1 - 31)
    %tR То же что и “%tH:%tM”
    %tT То же что и “%tH:%tM:%tS”
    %tr То же что и “%tI:%tM:%tS %Tp” где %Tp = (AM или PM)
     */

    private final String example;

    public StringExample(String example) {
        Date time = new Date();
        System.out.println(time.toString());
        String format = String.format("This exception is happened in %tT", time);
        System.out.println(format);
        this.example = example;
    }

    public String getRandomString() {
        String random = "Random string " + new Random().nextInt(1000);

        String nullString = null;

        return random;
    }

    public static void main(String[] args) {
        StringExample stringExample = new StringExample("asba");
        String a = "abc";
        String b = "abc";
        String c = "a/b/c/d";

        boolean empty = c.isEmpty();
        boolean blank = c.isBlank();

        String s4 = c.replaceFirst("/", "|");
        String s3 = c.replaceAll("/", "|");

        String[] split = c.split("/");

        for (String s : split) {
            String regex = "\\d";
            boolean matches = s.matches(regex);
            if (matches) {

            }
            System.out.println(s);
        }

        System.out.println(s3);

        String concat = a.concat(b);

        String substring = a.substring(1);
        String substring1 = a.substring(1, 3);

        String s1 = String.valueOf(1);

        String s2 = String.valueOf(1.1f);

        String format = String.format("This product with ID %s", a);

        String s = a + b;

        String replace = a.replace("b", "j");

        String intern = b.intern();

        System.out.println(replace);

        String filename = "file.jpeg";

        if (filename.endsWith(".jpeg")) {
            System.out.println("This is valid file");
        } else {

        }
    }
}
