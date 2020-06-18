package org.step.seventh.list;

import org.step.seventh.set.User;

import java.util.*;

public class ListExample {

    public void test() {
        List<User> userList = new ArrayList<>();
        userList.add(new User());
        userList.addAll(Collections.singletonList(new User()));
        userList.remove(new User());
        userList.removeAll(Arrays.asList());

        List<User> users = new LinkedList<>();
        Deque<User> usersDeque = new LinkedList<>();

        usersDeque.addFirst(new User());
        usersDeque.addLast(new User());
    }
}
