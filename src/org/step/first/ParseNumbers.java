package org.step.first;

public class ParseNumbers {

    public ParseNumbers() {
    }

    public ParseNumbers(int i) {

    }

//    public abstract
    public final void getName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        String num = "123";

        int i = Integer.parseInt(num);

        String str = "" + i;

        String s = Integer.toString(i);
        String s3 = Integer.toHexString(i);
        String s2 = Integer.toBinaryString(i);
        String s1 = Integer.toOctalString(i);

        System.out.println(s);
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s1);
    }
}
