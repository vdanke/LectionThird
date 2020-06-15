package org.step.fourth.exception;

public class ArithmeticCustomException extends ArithmeticException {

    private final int defaultValue = 3;

    public ArithmeticCustomException() {
        super();
    }

    public ArithmeticCustomException(String s) {
        super(s);
    }

    public int getDefaultValue() {
        return defaultValue;
    }
}
