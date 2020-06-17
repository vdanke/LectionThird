package org.step.six.thread.exceptions;

public class Push extends Thread {

    private final int cycle;

    public Push(int cycle, String name) {
        super(name);
        this.cycle = cycle;
    }

    @Override
    public void run() {
        int i = CustomClass.calculateOperation(cycle);
        throw new NullPointerException(String.valueOf(i));
    }

    public int getCycle() {
        return cycle;
    }
}
