package org.step.fifth.input.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {

    public static void main(String[] args) throws IOException {
        byte[] bytesToWrite = {1, 2, 3};
        byte[] bytesRead = new byte[10];

        String fileName = "test.txt";

        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;

        try {
            fileOutputStream = new FileOutputStream(fileName);
            System.out.println("File is opened to write");

            fileOutputStream.write(bytesToWrite);
            System.out.println("Written " + bytesToWrite.length + " amount of bytes");

            fileOutputStream.close();
            System.out.println("File output stream is closed");

            fileInputStream = new FileInputStream(fileName);
            System.out.println("File is opened to read");

            int available = fileInputStream.available();
            System.out.println(String.format("Available %d amount of bytes", available));

            int count = fileInputStream.read(bytesRead, 0, available);

            System.out.println(String.format("Written %d bytes", count));

            fileInputStream.close();
            System.out.println("File input stream is closed");

//            while (fileInputStream.read() != -1) {
//
//            }

        } catch (FileNotFoundException e) {
            System.out.println(String.format("File with name %s not found", fileName));
        } catch (IOException e) {
            System.out.println(String.format("Input Output Exception %s", e.toString()));
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
}
