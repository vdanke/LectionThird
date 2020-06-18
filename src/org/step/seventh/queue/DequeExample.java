package org.step.seventh.queue;

import org.step.seventh.set.User;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeExample {

    public void test(Deque<User> users) {
        Deque<User> userDeque = new ConcurrentLinkedDeque<>();
    }

    public static void main(String[] args) {
        DequeExample dequeExample = new DequeExample();

        dequeExample.test(new LinkedList<>());
        dequeExample.test(new ConcurrentLinkedDeque<>());
        dequeExample.test(new LinkedList<>());
    }
}
