package org.step.eights.lambda;

import java.util.concurrent.Callable;

public class CatchExceptionExample {

    public void test() {
        Runnable runnable = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Callable<String> callable = () -> {
            Thread.sleep(100);
            return "";
        };
    }
}
