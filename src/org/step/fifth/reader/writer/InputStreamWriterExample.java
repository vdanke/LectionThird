package org.step.fifth.reader.writer;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamWriterExample {

    public static void main(String[] args) throws IOException {
        Writer writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("test2.txt"), StandardCharsets.UTF_8)
                );
        writer.write("asdsad");
        writer.close();
    }
}
