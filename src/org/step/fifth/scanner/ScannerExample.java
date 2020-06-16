package org.step.fifth.scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "test2.txt";
        FileReader fileReader = new FileReader(fileName);

        Scanner sc = new Scanner(fileReader);
        Scanner console = new Scanner(System.in);

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                System.out.println("this is int " + sc.nextInt());
            } else if (sc.hasNextDouble()) {
                System.out.println("this is double " + sc.nextDouble());
            } else {
                System.out.println("Next " + sc.next());
            }
        }
    }
}
