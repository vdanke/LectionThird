package org.step.second.classes;

import org.step.second.methods.DatePrinter;

import java.util.Date;

public class Runner {

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClassImpl("Hello", 1);

        GoodInterface goodInterface = new SecondImpl("Good");

        DatePrinter datePrinter = new DatePrinter();
        datePrinter.printDate("I", 2);
        DatePrinter.printDate(new Date());
        String constant = DatePrinter.CONSTANT;
        String notConstant = DatePrinter.notConstant;

        abstractClass.printExample();
        goodInterface.printIAMGOOD();
    }
}
