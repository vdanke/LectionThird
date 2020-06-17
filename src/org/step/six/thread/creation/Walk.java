package org.step.six.thread.creation;

public class Walk implements Runnable {

    private final int cycleAmount;

    public Walk(int cycleAmount) {
        this.cycleAmount = cycleAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < cycleAmount; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Walking");
        }
    }
}
