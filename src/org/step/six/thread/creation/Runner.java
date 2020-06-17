package org.step.six.thread.creation;

public class Runner {

    public static void main(String[] args) throws Exception {
        Talk talk = new Talk(5);
        Thread walk = new Thread(new Walk(5));
        Lock lock = new Lock(5);

        System.out.println(talk.getState());
        talk.setName("Talk is my name");
        talk.start();
        System.out.println(talk.getName());
        System.out.println(talk.getState());
        System.out.println(talk.isAlive());
        walk.start();
        String call = lock.call();
        System.out.println(call);
        talk.join();
        Thread.sleep(5000);
        System.out.println(talk.getState());

        Thread thread1 = Thread.currentThread();

        System.out.println(thread1.getName());

        Thread thread = new Thread();

        thread.setName("DYATEL");
        thread.getName();
        thread.getPriority();
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.isAlive();
        thread.getId();
        thread.getState();
        thread.getThreadGroup();
        thread.interrupt();
        thread.setDaemon(true);
        thread.isDaemon();
        thread.yield();
    }
}
