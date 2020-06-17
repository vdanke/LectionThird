package org.step.six.thread.daemon;

public class DaemonDemo {

    public static void main(String[] args) {
        System.out.println(String.format("Starting main thread %s", Thread.currentThread().getName()));

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("End main thread %s", Thread.currentThread().getName()));
    }
}
