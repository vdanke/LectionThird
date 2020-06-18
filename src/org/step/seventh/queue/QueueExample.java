package org.step.seventh.queue;

import org.step.seventh.set.User;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public void test() {
        Queue<User> userQueue = new PriorityQueue<>(5);

        User second = new User(2, "second");
        User first = new User(1, "first");

        userQueue.add(first);
        userQueue.add(second);
        boolean isSucceed = userQueue.offer(new User(3, "third"));
        User remove = userQueue.remove();

        System.out.println(isSucceed);

        User peek = userQueue.peek();

        User element = userQueue.element();

        System.out.println(peek.toString());

        System.out.println("------START------");

        for (User u : userQueue) {
            System.out.println(u.toString());
        }
    }

    public static void main(String[] args) {
        QueueExample queueExample = new QueueExample();

        queueExample.test();
    }
}
