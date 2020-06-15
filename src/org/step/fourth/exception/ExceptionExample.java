package org.step.fourth.exception;

public class ExceptionExample {

    public void testException(String name, int index) throws ArithmeticCustomException, ArrayIndexOutOfBoundCustomException {
        int[] array = new int[1];

        if (name.length() < 5) {
            throw new ArithmeticCustomException("Exception");
        }
        if (array.length < index) {
            throw new ArrayIndexOutOfBoundCustomException("Out of bound", new Contributor("Contributor"));
        }
    }

    public void testRuntimeException(String name) {
        if (name.length() < 5) {
            throw new RuntimeException("Runtime Exception");
        }
    }

    public static void main(String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();

        try {
            exceptionExample.testException("ad", 4);
        } catch (ArithmeticCustomException e) {
            System.out.println(e.getLocalizedMessage() + " " + e.getDefaultValue());
        } catch (ArrayIndexOutOfBoundCustomException e) {
            System.out.println(e.getContributor().getSpecialMessage() + " " + e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        exceptionExample.testRuntimeException("abc");
    }
}
