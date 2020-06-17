package org.step.six.thread.creation;

public class Talk extends Thread {

    private final int cycleAmount;

    public Talk(int cycleAmount) {
        this.cycleAmount = cycleAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < cycleAmount; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Talking");
        }
    }
}
