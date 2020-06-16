package org.step.fifth.input.output;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputOutputStream {

    public static void main(String[] args) {
        PipedInputStream pipedInputStream = null;
        PipedOutputStream pipedOutputStream = null;

        try {
            int count = 0;
            int[] toRead = null;
            pipedInputStream = new PipedInputStream();
            pipedOutputStream = new PipedOutputStream(pipedInputStream);

            for (int i = 0; i < 20; i++) {
                pipedOutputStream.write(i);
            }
            int available = pipedInputStream.available();
            System.out.println(String.format("Bytes available %d", available));

            toRead = new int[available];
            for (int i = 0; i < available; i++) {
                toRead[i] = pipedInputStream.read();
                System.out.println(toRead[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
