package org.step.fourth.string.builder;

public class StringBuilderBufferExample {

    public static void main(String[] args) {
        String s = "asbcsad";

        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuffer stringBuffer = new StringBuffer(s);
        StringBuilder stringBuilder1 = new StringBuilder(5);

        stringBuilder.append("asd");

        String s1 = stringBuilder.toString();

        stringBuilder.insert(4, "THIS IS SPARTA");

        stringBuilder.delete(4, 9);

        stringBuilder.deleteCharAt(10);

        stringBuilder.reverse();

        int length = stringBuilder.length();

        int capacity = stringBuilder.capacity();

        stringBuilder.ensureCapacity(32);

        stringBuilder.trimToSize();

        System.out.println(length);

        stringBuilder.setLength(10);

        System.out.println(stringBuilder.toString());
    }
}
