package org.step.second.methods;

import java.util.Date;

public class DatePrinter {

    public static final String CONSTANT = "Constant";
    public static String notConstant = "Not constant";

    /*
    При первом контакте
     */
    static {
        System.out.println("Static");
    }

    public DatePrinter() {
        /*
        После обычного блока кода
         */
        System.out.println("Constructor");
    }

    /*
    Сразу после инициализации конструктора
     */
    {
        System.out.println("Default");
    }

    public int printDate(String s, int i) {
        System.out.println("String " + s);
        return i;
    }

    public void printDate(int day, int month, int year) {
        System.out.println(day + month + year);
    }

    public int printDate(int i, String s) {
        System.out.println(s);
        return i;
    }

    public int print(int i)
    {
        return 0;
    }

    public int getSum(String s, int... i) {
        return i.length;
    }

    public static void printDate(Date date) {
        System.out.println(date.toString());
    }
}
