package org.step.six.thread.exceptions;

public class ThreadExceptionHandler {

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread thread, Throwable throwable) {
                        System.out.println(thread.getName() + " " + throwable.getLocalizedMessage());
                    }
                }
        );

        Push thread = new Push(1, "Push");

        thread.setUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread thread, Throwable throwable) {
                        Push thread1 = (Push) thread;
                        System.out.println(thread1.getCycle());
                        System.out.println(thread.getName() + " " + throwable.toString());
                    }
                }
        );
        thread.start();
    }
}
