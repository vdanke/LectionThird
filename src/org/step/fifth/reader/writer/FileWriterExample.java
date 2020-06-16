package org.step.fifth.reader.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterExample {

    public static void main(String[] args) {
        PrintWriter printWriter = null;

        try {
            FileWriter fileWriter = new FileWriter("test.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            printWriter = new PrintWriter(bufferedWriter);

            printWriter.println("The new sentence");

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }
}
