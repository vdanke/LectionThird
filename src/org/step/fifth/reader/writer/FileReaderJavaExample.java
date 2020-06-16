package org.step.fifth.reader.writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderJavaExample {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/org/step/fifth/reader/writer/FileReaderJavaExample.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        /*
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
         */
        bufferedReader
                .lines()
                .forEach(System.out::println);
        fileReader.close();
    }
}
