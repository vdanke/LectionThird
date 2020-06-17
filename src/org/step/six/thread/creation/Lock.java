package org.step.six.thread.creation;

import java.util.concurrent.Callable;

public class Lock implements Callable<String> {

    private final int cycleAmount;

    public Lock(int cycleAmount) {
        this.cycleAmount = cycleAmount;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < cycleAmount; i++) {
            if (i == (cycleAmount - 1)) {
                return "End is coming";
            }
        }
        return "Cycle is over";
    }
}
