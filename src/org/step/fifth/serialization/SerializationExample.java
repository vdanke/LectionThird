package org.step.fifth.serialization;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {

            Object obj = new Integer(2);
            objectOutputStream.writeObject(obj);

            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (byte b : byteArray) {
                System.out.println((char) b);
            }
            System.out.println();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Object readObject = objectInputStream.readObject();

            System.out.println("Read object " + readObject.toString());
            System.out.println("Is equals after " + (obj.equals(readObject)));
            System.out.println("Reference equality is " + (obj == readObject));
        }
    }
}
