package org.step.fifth.input.output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamExample {

    public static void main(String[] args) {
        byte[] bytes = {1, -1, 0};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        System.out.println("Available bytes " + byteArrayInputStream.available());

        int firstByte = byteArrayInputStream.read();
        System.out.println("First byte is " + firstByte);

        int secondByte = byteArrayInputStream.read();
        System.out.println("Second byte is " + secondByte);

        int thirdByte = byteArrayInputStream.read();
        System.out.println("Third byte is " + thirdByte);

        System.out.println("After reading available is " + byteArrayInputStream.available());

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byteArrayOutputStream.write(10);
        byteArrayOutputStream.write(11);

        byte[] outputBytes = byteArrayOutputStream.toByteArray();

        System.out.println(outputBytes.length);
    }
}
