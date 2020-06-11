package org.step.first;

import org.step.first.model.User;

public class Main {

    /*
    Java SE
    Java EE
    Java ME

    JVM
    javac
    JRE

    Память:
        Heap
        Stack

    .java -> javac -> .class -> Interpretator (java.exe) <- java libraries
     */

    public static void main(String[] args) {
        User user = new User();

        // Целочисленные
        byte b = 0;
        Byte by = 0;
        short s = 0;
        Short sh = 0;
        int i = 0;
        Integer in = 0;
        long l = 1L;
        Long lon = 1L;

        double d = 0.0d;
        float f = 0.0f;

        char c = 'c';
        Character ch = 'a';
        int cha = (int) c;

        boolean bln = false;

        // null true false

        long t = (long) i;
        int x = (int) t;

        System.out.println(cha);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.max(1, 3));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY);

        BigNumbers bigNumbers = new BigNumbers();
        first();

        System.out.println("abc");
    }

    private static void first() {
        second();
    }

    private static void second() {
    }
}
