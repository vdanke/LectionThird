package org.step.six.thread.exceptions;

public class CustomClass {

    public static synchronized int calculateOperation(int i) {
        return i;
    }

    public int calculateSomething(int i) {
        synchronized (this) {
            return i;
        }
    }
}
