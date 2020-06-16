package org.step.fifth.input.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceExample {

    public static void main(String[] args) throws IOException {
        FileInputStream first = null;
        FileInputStream second = null;
        SequenceInputStream sequenceInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            first = new FileInputStream("test.txt");
            second = new FileInputStream("test1.txt");
            sequenceInputStream = new SequenceInputStream(first, second);
            fileOutputStream = new FileOutputStream("test2.txt");

            int read = sequenceInputStream.read();
            while (read != -1) {
                fileOutputStream.write(read);
                read = sequenceInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sequenceInputStream.close();
            fileOutputStream.close();
        }
    }
}
