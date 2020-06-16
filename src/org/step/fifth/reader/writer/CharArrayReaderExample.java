package org.step.fifth.reader.writer;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayReaderExample {

    public static void main(String[] args) throws IOException {
        String tmp = "sadaeq,hksdgfskdbnfgqvwhqwne";

        int length = tmp.length();

        char[] chars = new char[length];

        tmp.getChars(0, length, chars, 0);

        char[] chars1 = tmp.toCharArray();

        CharArrayReader first = new CharArrayReader(chars);
        CharArrayReader second = new CharArrayReader(chars, 0, 5);

        int i;

        System.out.println("First is:");
        while ((i = first.read()) != -1) {
            System.out.println((char) i);
        }
        System.out.println();
        while ((i = second.read()) != -1) {
            System.out.println((char) i);
        }
        System.out.println();
    }
}
