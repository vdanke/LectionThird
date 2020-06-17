package org.step.six.thread.priority;

public class ClickerDemo {

    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        Clicker first = new Clicker();
        Clicker second = new Clicker();

        first.setPriority(Thread.NORM_PRIORITY - 2);
        second.setPriority(Thread.NORM_PRIORITY + 2);

        first.start();
        second.start();

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        first.stopClicking();
        second.stopClicking();

        try {
            first.join();
            second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("First thread with priority %d clicked %d", first.getPriority(), first.getClick()));
        System.out.println(String.format("Second thread with priority %d clicked %d", second.getPriority(), second.getClick()));
    }
}
