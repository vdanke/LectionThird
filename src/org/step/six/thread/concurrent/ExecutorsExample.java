package org.step.six.thread.concurrent;

import org.step.six.thread.creation.Lock;
import org.step.six.thread.creation.Talk;
import org.step.six.thread.creation.Walk;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Walk walk = new Walk(5);
        Talk talk = new Talk(5);
        Lock lock = new Lock(5);

        ExecutorService first = Executors.newCachedThreadPool();
        ExecutorService second = Executors.newSingleThreadExecutor();
        ExecutorService third = Executors.newFixedThreadPool(5);
        ScheduledExecutorService fourth = Executors.newScheduledThreadPool(10);

//        first.execute(walk);
        Future<?> submit = first.submit(walk);
        Future<String> submit1 = first.submit(lock);
        Future<?> submit2 = first.submit(talk);

        String s = submit1.get(10, TimeUnit.MINUTES);

        submit.get();
        submit1.get();
        submit2.get();

//        fourth.schedule();
        /*
        1L - как часто
        2L - сколько раз
         */
        ScheduledFuture<?> scheduledFuture = fourth.scheduleAtFixedRate(walk, 1L, 3L, TimeUnit.MINUTES);
        Object o = scheduledFuture.get();

        boolean isShutdown = first.isShutdown();

        if (!isShutdown) {
            first.shutdown();
//            first.shutdownNow()
        }
    }
}
