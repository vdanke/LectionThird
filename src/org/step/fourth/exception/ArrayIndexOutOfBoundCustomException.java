package org.step.fourth.exception;

public class ArrayIndexOutOfBoundCustomException extends ArrayIndexOutOfBoundsException {

    private Contributor contributor;

    public ArrayIndexOutOfBoundCustomException() {
        super();
    }

    public ArrayIndexOutOfBoundCustomException(String s) {
        super(s);
    }

    public ArrayIndexOutOfBoundCustomException(int index) {
        super(index);
    }

    public ArrayIndexOutOfBoundCustomException(String s, Contributor contributor) {
        super(s);
        this.contributor = contributor;
    }

    public Contributor getContributor() {
        return contributor;
    }
}
