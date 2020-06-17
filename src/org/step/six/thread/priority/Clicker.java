package org.step.six.thread.priority;

public class Clicker extends Thread {

    private int click = 0;
    private volatile boolean running = true;

    public Clicker() {
    }

    @Override
    public void run() {
        while (running) {
            click++;
        }
    }

    public void stopClicking() {
        running = false;
    }

    public int getClick() {
        return click;
    }
}
